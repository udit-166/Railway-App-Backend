package com.registering.ServiceImpl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;


import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import com.registering.entity.BookingTrain;
import com.registering.entity.Traveller;
import com.registering.repositories.BookingRepository;
import com.registering.repositories.TravellerRepository;
import com.registering.service.BookingTicketServcie;


@Service
public class BookingTicketServiceImpl implements BookingTicketServcie{
	
	@Autowired
	private BookingRepository bookingRepository;
	
	@Autowired
	private TravellerRepository travellerRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	private final String userServiceBaseUrl = "http://localhost:8088/api/users/";
	
	private final String razorpayKey = "rzp_test_vLcVySUwnoXsiK";
    private final String razorpaySecret = "3VQpyLBwSE4U63QeYgxQ4GEn";
    
  

    public static byte[] generateTrainTicket() throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        // Create PDF Document
        PdfWriter writer = new PdfWriter(outputStream);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf, PageSize.A4);
        
        document.setMargins(20, 20, 20, 20);

        // Add Title
        document.add(new Paragraph("IRCTC e-Ticketing Service").setBold().setFontSize(16).setTextAlignment(TextAlignment.CENTER));
        document.add(new Paragraph("Electronic Reservation Slip (Personal User)").setFontSize(12).setTextAlignment(TextAlignment.CENTER));

        // Add Space
        document.add(new Paragraph("\n"));

        // Add Passenger & Train Details Table
        float[] columnWidths = {200F, 200F};
        Table table = new Table(columnWidths);

        // Add Header
        table.addCell(new Paragraph("PNR No:"));
        table.addCell(new Paragraph("1234567890"));

        table.addCell(new Paragraph("Train No & Name:"));
        table.addCell(new Paragraph("12531 - Intercity-Superfast"));

        table.addCell(new Paragraph("Boarding Date:"));
        table.addCell(new Paragraph("12/12/2024"));

        table.addCell(new Paragraph("Class:"));
        table.addCell(new Paragraph("Sleeper"));

        table.addCell(new Paragraph("From Station:"));
        table.addCell(new Paragraph("Gorakhpur Jn"));

        table.addCell(new Paragraph("To Station:"));
        table.addCell(new Paragraph("Lucknow Jn"));

        table.addCell(new Paragraph("Passenger Name:"));
        table.addCell(new Paragraph("Udit Shahi"));

        document.add(table);

        // Add Footer
        document.add(new Paragraph("\nThank you for using railbook services.")
                .setFontSize(10)
                .setTextAlignment(TextAlignment.CENTER));

        document.close();
        return outputStream.toByteArray();
    }
    
    public void sendEmail(String subject, String to) {
        String from  = "uditshahi96@gmail.com";
        String host = "smtp.gmail.com";

        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // Get the session object
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("uditshahi96@gmail.com", "ddrpyglpsxptbbto");
            }
        });

        session.setDebug(true);

        try {
            // Compose the email message
            MimeMessage m = new MimeMessage(session);
            m.setFrom(from);
            m.addRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(to));
            m.setSubject(subject);

            // Create a MimeMultipart to include the email content and attachments
            MimeMultipart multipart = new MimeMultipart();

            // First part: HTML message
            MimeBodyPart textPart = new MimeBodyPart();
            String htmlMessage = "" +
                "<div>" +
                "<p>Thank you for booking your ticket through Railbook. We are pleased to confirm your reservation.</p>" +
                "<p>Please find your train ticket attached as a PDF.</p>" +
                "<br><br>" +
                "<p>If you have any questions or need further assistance, feel free to contact us.</p>" +
                "</div>";
            textPart.setContent(htmlMessage, "text/html");
            multipart.addBodyPart(textPart);

            // Second part: PDF attachment (Train Ticket)
            MimeBodyPart attachmentPart = new MimeBodyPart();

            // Generate the PDF byte array
            byte[] pdfBytes = generateTrainTicket();
            ByteArrayDataSource dataSource = new ByteArrayDataSource(pdfBytes, "application/pdf");

            attachmentPart.setDataHandler(new DataHandler(dataSource));
            attachmentPart.setFileName("Train_Ticket.pdf");

            multipart.addBodyPart(attachmentPart);

            // Set the entire content of the message
            m.setContent(multipart);

            // Send the email
            Transport.send(m);

            System.out.println("Send success...............");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    
    @Override
    public void bookTrain(BookingTrain ticket, String token) {
        String validateUrl = userServiceBaseUrl + "profile";

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", token);
        System.out.println(token);
        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);
        long userId = 0;

        try {
            ResponseEntity<Map> userResponse = restTemplate.exchange(validateUrl, HttpMethod.GET, requestEntity, Map.class);
            System.out.println("API Response: " + userResponse.getBody());

            if (userResponse.getStatusCode().is2xxSuccessful() && userResponse.getBody() != null) {
                Map<String, Object> userMap = userResponse.getBody();
                if (userMap.containsKey("id")) {
                    userId = Long.parseLong(userMap.get("id").toString());
                } else {
                    System.out.println("Response does not contain 'id'.");
                }
            }
        } catch (HttpClientErrorException | HttpServerErrorException e) {
            System.out.println("Error during API call: " + e.getStatusCode() + " - " + e.getResponseBodyAsString());
            throw new RuntimeException("Failed to fetch user details.");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
            throw new RuntimeException("Unexpected error occurred.");
        }

        // Validate the userId
        if (userId == 0) {
            throw new IllegalStateException("User ID could not be fetched. Cannot proceed with booking.");
        }

        // Booking details
        BookingTrain bookingDetail = new BookingTrain();
        bookingDetail.setEmail(ticket.getEmail());
        bookingDetail.setIrctc(ticket.getIrctc());
        bookingDetail.setUser_id(userId);
        bookingDetail.setSeat_class(ticket.getSeat_class());
        bookingDetail.setSeat_number(ticket.getSeat_number());
        bookingDetail.setTotal_price(ticket.getTotal_price());
        bookingDetail.setCoach_number(ticket.getCoach_number());

        // Save the booking details
        bookingDetail = bookingRepository.save(bookingDetail);

        // Save the linked travellers
        for (Traveller traveller : ticket.getTravellers()) {
            traveller.setBookingTrain(bookingDetail); // Link each traveller to the booking
            travellerRepository.save(traveller);
        }
        sendEmail("Ticket Confirmation - RailBook", ticket.getEmail());
        System.out.println("Booking successful with userId: " + userId);
    }

	
	public Order createOrder(int amount) throws RazorpayException {
		 RazorpayClient razorpayClient = new RazorpayClient(razorpayKey, razorpaySecret);

	        JSONObject orderRequest = new JSONObject();
	        orderRequest.put("amount", amount * 100);  // in paise
	        orderRequest.put("currency", "INR");
	        orderRequest.put("receipt", "order_receipt#1");

	        Order order = razorpayClient.orders.create(orderRequest);
	        return order;
	}

}
