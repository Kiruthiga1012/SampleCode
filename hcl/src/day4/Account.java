package day4;

import java.util.*;

public  class Account {
	long accNum;
	static double balance;
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		Random r=new Random();
		accNum=r.nextLong();
		this.accNum = accNum;
	}
	public double getBalance() {
		System.out.println(balance);
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
		balance=balance+amount;

	}
	public void withdraw(double amount) {
		balance=balance-amount;
	}
}
class SavingsAccount extends Account{
	final double minimumBalance=1000;
	public void withdraw(double amount) {
		if(balance>minimumBalance) {
			if(amount<=balance-minimumBalance)
				balance=balance-amount;
			else
				System.out.println("After withdraw the minimum balance should be there in account so withdrawal is not possible");
		}

		else { 
			System.out.println("Insufficient balance"); 
		}

	}
}
