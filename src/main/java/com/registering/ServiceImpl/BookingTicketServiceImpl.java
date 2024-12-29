package com.registering.ServiceImpl;

import java.util.ArrayList;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	private final String razorpayKey = "rzp_test_vLcVySUwnoXsiK";
    private final String razorpaySecret = "3VQpyLBwSE4U63QeYgxQ4GEn";

	@Override
	public void bookTrain(BookingTrain ticket) {
		
		BookingTrain bookingDetail = new BookingTrain();
        bookingDetail.setEmail(ticket.getEmail());
        bookingDetail.setIrctc(ticket.getIrctc());
        bookingDetail.setSeat_class(ticket.getSeat_class());
        bookingDetail.setSeat_number(ticket.getSeat_number());
        bookingDetail.setTotal_price(ticket.getTotal_price());
        bookingDetail.setCoach_number(ticket.getCoach_number());

        // Save the BookingTrain first, which will generate the BookingId.
        bookingDetail = bookingRepository.save(bookingDetail); // Save the bookingDetail

        // Step 2: Now, set the BookingId for all travellers.
        ArrayList<Traveller> travellers = new ArrayList<>();
        
        for (Traveller traveller : ticket.getTravellers()) {
            traveller.setBookingTrain(bookingDetail); // Link each traveller to the booking
            travellerRepository.save(traveller);
        }

        // Step 3: Save the travellers with their linked booking
        // Since CascadeType.ALL is set, the travellers will be saved along with the BookingTrain
        bookingRepository.save(bookingDetail); // Save both booking and travellers
		
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
