package model;

public class ElectricCar extends Car implements CalculateConsumeElectric,CalculatePriceVehicle{

	private boolean typeCharger;
	private double duration;
	private double consume;

	public ElectricCar(double basePrice, double sellPrice, String brand, String model, double cilyndryCapacity, double km,
			boolean newOrUsed, String licensePlate,boolean haveSoat, boolean type, int doorsNumber, boolean windows,boolean typeCharger,double duration,boolean typeVehicle) {
		super(basePrice, sellPrice, brand, model, cilyndryCapacity, km, newOrUsed, licensePlate,haveSoat, type, doorsNumber,
				windows,typeVehicle);
		
		this.typeCharger = typeCharger;
		this.duration = duration;
		this.consume = consume;
		
	}

	public boolean isTypeCharger() {
		return typeCharger;
	}

	public void setTypeCharger(boolean typeCharger) {
		this.typeCharger = typeCharger;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public double getConsume() {
		return consume;
	}

	public void setConsume(double consume) {
		this.consume = consume;
	}

	@Override
	public double calculateConsumeElectric() {

		if (this.typeCharger == true) {
			
			consume = (this.duration + 13) * (this.getCilyndryCapacity()/electricCar);
		} else {
			
			consume = (this.duration + 18) * (this.getCilyndryCapacity()/electricCar);
			
		}
		
		return consume;
	}

	@Override
	public double calculatePrice() {
		
		double totalPrice ;
		
		if(this.isHaveSoat()==true) {
			
			totalPrice = (this.getBasePrice()*percentageElectricCar) + this.getSellPrice();
		}else {
		
		totalPrice = ((this.getBasePrice()*percentageElectricCar) + this.getSellPrice()) + expiredDocumentation;
		
		}
		
		if(this.isNewOrUsed()==false) {
			
			totalPrice = totalPrice * carUsed;
		}
		
		return totalPrice;
	}
	
	


}
