package com.registering.service;

import com.razorpay.Order;
import com.razorpay.RazorpayException;
import com.registering.entity.BookingTrain;

public interface BookingTicketServcie {
	
	public void bookTrain(BookingTrain ticket,String token);
	
	public Order createOrder(int amount) throws RazorpayException; 
}
