package org.base.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.persistence.Column;
import javax.persistence.Id;

import org.base.cu.CurrentAccount;
import org.base.sa.SavingsAccount;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter 1 for savings_account and 2 for current_account");
		int c = Integer.valueOf(bf.readLine());
		switch (c) {
		case 1:
			SavingsAccount savings = new SavingsAccount();
			System.out.println("enter account_number");
			savings.setAccountNumber(Long.valueOf(bf.readLine()));
			/*
			 * System.out.println("enter account_holder");
			 * savings.setAccountHolder(bf.readLine());
			 * System.out.println("enter address");
			 * savings.setAddress(bf.readLine());
			 * System.out.println("enter phone_number");
			 * savings.setPhoneNumber(Long.valueOf(bf.readLine()));
			 * System.out.println("enter emailid");
			 * savings.setEmailId(bf.readLine()); System.out.println("balance");
			 * savings.setBalance(Double.valueOf(bf.readLine()));
			 */
			System.out.println("enter 1 for withdrwal and 2 for deposit");
			int read = Integer.valueOf(bf.readLine());
			switch (read) {
			case 1:
				System.out.println("enter amount to be withdrawn");
				savings.setAmountTransfered(Integer.valueOf(bf.readLine()));
				boolean a = savings.withdraw(savings.getAmountTransfered());
				break;
			case 2:
				System.out.println("enter amount to be deposit");
				savings.setAmountTransfered(Integer.valueOf(bf.readLine()));
				boolean a1 = savings.deposit(savings.getAmountTransfered());
				break;
			default:
				break;
			}
		case 2:
			CurrentAccount current = new CurrentAccount();
			System.out.println("enter account_number");
			current.setAccountNumber(Long.valueOf(bf.readLine()));
			System.out.println("enter 1 for withdrwal and 2 for deposit");
			int read1 = Integer.valueOf(bf.readLine());
			switch (read1) {
			case 1:
				System.out.println("enter amount to be withdrawn");
				current.setAmountTransferred(Integer.valueOf(bf.readLine()));
				boolean a = current.withdraw(current.getAmountTransferred());
				break;
			case 2:
				System.out.println("enter amount to be deposit");
				current.setAmountTransferred(Integer.valueOf(bf.readLine()));
				boolean a1 = current.deposit(current.getAmountTransferred());
				break;
			default:
				break;
			}
		}

	}
}
