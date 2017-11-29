package org.base.cu;

import javax.persistence.Entity;

import org.base.BankAccount;
@Entity
public class CurrentAccount extends BankAccount {
	private static double minimumAmountTObeTransferred=500000;
	private static int minimumNumberOfTransaction =7;
	private double amountTransferred;
	private int numberOfTransactionHeld;
	public static double getMinimumAmountTObeTransferred() {
		return minimumAmountTObeTransferred;
	}
	public static void setMinimumAmountTObeTransferred(double minimumAmountTObeTransferred) {
		CurrentAccount.minimumAmountTObeTransferred = minimumAmountTObeTransferred;
	}
	public static int getMinimumNumberOfTrasaction() {
		return minimumNumberOfTransaction;
	}
	public static void setMinimumNumberOfTrasaction(int minimumNumberOfTrasaction) {
		CurrentAccount.minimumNumberOfTransaction = minimumNumberOfTrasaction;
	}
	public double getAmountTransferred() {
		return amountTransferred;
	}
	public void setAmountTransferred(double amountTransferred) {
		this.amountTransferred = amountTransferred;
	}
	public int getNumberOfTransactionHeld() {
		return numberOfTransactionHeld;
	}
	public void setNumberOfTransactionHeld(int numberOfTransactionHeld) {
		this.numberOfTransactionHeld = numberOfTransactionHeld;
	}
	public CurrentAccount(long accountNumber, String accountHolder, String address, long phoneNumber, String emailId,
			double balance) {
		super(accountNumber, accountHolder, address, phoneNumber, emailId, balance);
	}
	public CurrentAccount() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean withdraw(double amount) {
		if (numberOfTransactionHeld < minimumNumberOfTransaction && amountTransferred <= minimumAmountTObeTransferred) {
		balance -= balance * 0.05;
		return super.withdraw(amount);
		} else if (numberOfTransactionHeld > minimumNumberOfTransaction
		&& amountTransferred <= minimumNumberOfTransaction){ 
		return super.withdraw(amount);
		} 
		else if (amountTransferred >minimumAmountTObeTransferred) {
		System.out.println("Tansfer limit exceeded");
		}
		return false;
		}
}


