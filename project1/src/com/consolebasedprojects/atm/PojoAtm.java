package com.consolebasedprojects.atm;

public class PojoAtm {

	private long accountNumber;
	private String userName;
	private String balance;
	private int pin;
	
	public PojoAtm() {}
	
	public PojoAtm(long accountNumber,String userName,String balance,int pin) {
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.balance = balance;
		this.pin = pin;
	}
	
//	Getters and Setters
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
}
