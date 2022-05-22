package model;

import java.util.ArrayList;

public class TechnoMecanical extends Document{
	
	private double gasLevel;
	
	public TechnoMecanical(double price, Date year, double gasLevel) {
		super(price,year);
		
		this.gasLevel = gasLevel;
		
	}

	public double getGasLevel() {
		return gasLevel;
	}

	public void setGasLevel(double gasLevel) {
		this.gasLevel = gasLevel;
	}

}
