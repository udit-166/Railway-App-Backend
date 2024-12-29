package com.registering.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.razorpay.Order;
import com.razorpay.RazorpayException;
import com.registering.entity.AuthResponse;
import com.registering.entity.BookingTrain;
import com.registering.response.OrderResponse;
import com.registering.service.BookingTicketServcie;

@RestController
@RequestMapping("/api/booking")
public class BookingController {
	
	@Autowired
	private BookingTicketServcie bookingServcie;
	
	@PostMapping("/book")
    public ResponseEntity<AuthResponse> bookTrain(@RequestBody BookingTrain bookingRequest) {
        try {
            // Call service to handle booking
            bookingServcie.bookTrain(bookingRequest);
            AuthResponse res = new AuthResponse();
            res.setMsg("The data is uploaded successfully!!");
            res.setCode("200");
            return ResponseEntity.ok(res); // Return the booked ticket as a response
        } catch (Exception e) {
            // Handle exceptions and return an appropriate response
            return ResponseEntity.badRequest().body(null);
        }
    }
	@PostMapping("/createOrder")
    public ResponseEntity<OrderResponse> createOrder(@RequestBody Map<String, Integer> paymen) {
        try {
        	int payment1 = (int)paymen.get("payment");
            Order order = bookingServcie.createOrder(payment1);
           OrderResponse paymentDetails = new OrderResponse();
           paymentDetails.setId(order.get("id"));
           paymentDetails.setCurrency(order.get("currency"));
           paymentDetails.setAmount(order.get("amount"));
           paymentDetails.setReceipt(order.get("receipt"));
           
            return ResponseEntity.ok(paymentDetails);
        } catch (RazorpayException e) {
        	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .contentType(MediaType.APPLICATION_JSON)  // Ensure response is JSON
                    .body(null);
        }
    }
}
