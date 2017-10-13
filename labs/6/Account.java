package cmpt220;

import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	
	public Account() {
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public int getID() {
		return id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 12) / 100;
	}
	
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}
	
	public void withdraw(double withdrawAmount) {
		balance -= withdrawAmount;
	}
	
	public void deposit(double depositAmount) {
		balance += depositAmount;
	}

}
