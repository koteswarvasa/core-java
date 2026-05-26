
package com.consolebasedprojects.atm;

public abstract class AtmProjectAbstract implements AtmProjectInterface {

	@Override
	public abstract void deposit(double amount);

	@Override
	public abstract void withdraw(double amount);

	@Override
	public abstract Double checkBalance();

}