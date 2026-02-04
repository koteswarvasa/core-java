package com.oops.inheritance.tasks;

public class Device {

	boolean power;
	
	void isTurnOn() {
		 power=true;
	}
	
	void isTurnOff() {
		 power=false;
	}
	
	boolean isPowerOn() {
		return power;
	}
	
}
