package com.tasks.oops.encapsulation;

public class Orders {
	
	public static void main(String[] args) {
		
		DriverOrders do1 = new DriverOrders();
		do1.setOrderId(1);
		do1.setItemName("biryani");
		do1.setItemName("Dum biryani");
//		do1.add("dum biriyani");
		do1.setQuantity(1);
		do1.setQuantity(2);
//		do1.addQuantity(1);
		do1.setOrderStatus("plac");
//		do1.updateOrderStatus("placed");
		
		do1.display();
		do1.updateOrderStatus("placed");
		do1.display();
	}
}
