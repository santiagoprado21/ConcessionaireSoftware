package model;

public interface CalculatePriceVehicle {
	
	final int expiredDocumentation = 500000;
	
	final double percentageElectricCar = 0.20;
	
	final double percentageHybridCar = 0.15;
	
	final double carUsed = 0.10;
	
	final double motocycleUsed = 0.02;
	
	final double motocycleUp = 0.04;
	
	public abstract double calculatePrice();
	
}
