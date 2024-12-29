package com.registering.response;

public class OrderResponse {
	
	private String id;
    private String currency;
    private int amount;
    private String receipt;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getReceipt() {
		return receipt;
	}
	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}
	public OrderResponse(String id, String currency, int amount, String receipt) {
		super();
		this.id = id;
		this.currency = currency;
		this.amount = amount;
		this.receipt = receipt;
	}
	public OrderResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderResponse [id=" + id + ", currency=" + currency + ", amount=" + amount + ", receipt=" + receipt
				+ "]";
	}
    
    
}
