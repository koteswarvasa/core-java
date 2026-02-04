package com.oops.inheritance.tasks;

public class SmartDevice extends Device{
void useDevice(){
	if(isPowerOn()) {
		System.out.println("Power is use");
	}else {
		System.out.println("Power is not used,Please Turn on the Power !!");
	}
}
public static void main(String[] args) {
	SmartDevice sd1 = new SmartDevice();
//	sd1.isTurnOn();
	sd1.isTurnOff();
	sd1.useDevice();
}
}


