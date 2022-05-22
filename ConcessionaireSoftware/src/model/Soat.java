package model;

import java.util.ArrayList;

public class Soat extends Document{
	
	private double amount;
	
	public Soat(double price, Date year,double amount) {
		super(price,year);
		
		this.amount = amount;
		
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
