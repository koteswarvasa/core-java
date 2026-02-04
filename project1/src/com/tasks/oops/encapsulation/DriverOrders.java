package com.tasks.oops.encapsulation;

public class DriverOrders {

	private int orderId;
	private String itemName="";
	private int quantity;
	private String orderStatus;
	
	
	public int getOrderId() {
		return orderId;
	}
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName += itemName+" ";
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity += quantity;
	}
	
	public String getOrderStatus() {
		return orderStatus;
	}
	
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
	public void updateOrderStatus(String orderStatus) {
		this.orderStatus=orderStatus;
	}
//	public void add(String addItems) {
//		itemName=itemName+" , "+addItems;
//		
//	}
	
//	public void addQuantity(int addQuatity) {
//		quantity+=addQuatity;
//	}
	public void display() {
		System.out.println("********************************");
		System.out.println("Order id: "+getOrderId());
		System.out.println("Order Items: "+getItemName());
		
		if(getQuantity()>0) {
		System.out.println("Order Quantity: "+getQuantity());
		}else {
			System.out.println("orderQuantity is greater than 0");
			return;
		}
		
		if(getOrderStatus().equals("placed")) {
		System.out.println("Fully placed");
		}else {
			System.out.println("Not placed");
		}
	}
	
	
	
}
