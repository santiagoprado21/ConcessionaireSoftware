package model;

public class HybridCar extends Car implements CalculateConsumeElectric,CalculateConsume,CalculatePriceVehicle{

	private double capacityHybrid;
	private TypeGasoline gasolineType;
	private double consume;
	private boolean typeChargerHybrid;
	private double durationHybrid;
	private double consumekw;

	public HybridCar(double basePrice, double sellPrice, String brand, String model, double cilyndryCapacity, double km,
			boolean newOrUsed, String licensePlate,boolean haveSoat, boolean type, int doorsNumber, boolean windows, double capacityHybrid,
			TypeGasoline gasolineType, boolean typeChargerHybrid, double durationHybrid,boolean typeVehicle) {
		super(basePrice, sellPrice, brand, model, cilyndryCapacity, km, newOrUsed, licensePlate,haveSoat, type, doorsNumber,
				windows,typeVehicle);

		this.capacityHybrid = capacityHybrid;
		this.gasolineType = gasolineType;
		this.consume = consume;
		this.typeChargerHybrid = typeChargerHybrid;
		this.durationHybrid = durationHybrid;
		this.consumekw = consumekw;

	}

	public double getCapacity() {
		return capacityHybrid;
	}

	public void setCapacity(double capacityHybrid) {
		this.capacityHybrid = capacityHybrid;
	}

	public TypeGasoline getGasolineType() {
		return gasolineType;
	}

	public void setGasolineType(TypeGasoline gasolineType) {
		this.gasolineType = gasolineType;
	}

	public double getConsume() {
		return consume;
	}

	public void setConsume(double consume) {
		this.consume = consume;
	}

	public boolean isTypeCharger() {
		return typeChargerHybrid;
	}

	public void setTypeCharger(boolean typeChargerHybrid) {
		this.typeChargerHybrid = typeChargerHybrid;
	}

	public double getDuration() {
		return durationHybrid;
	}

	public void setDuration(double durationHybrid) {
		this.durationHybrid = durationHybrid;
	}

	public double getConsumekW() {
		return consumekw;
	}

	public void setConsumekW(double consumewk) {
		this.consumekw = consumekw;
	}

	@Override
	public double calculateConsume() {
		
		consume = this.getCapacity()*(this.getCilyndryCapacity()/hybridCar);
		
		return consume;
	
	}

	@Override
	public double calculateConsumeElectric() {
		
		if(this.typeChargerHybrid == true) {
			
			consumekw = this.durationHybrid*(this.getCilyndryCapacity()/hybridCarKw);
		} else {
			
			consumekw = (this.durationHybrid + 7) * (this.getCilyndryCapacity()/hybridCarKw);
		}
		
		return consumekw;
	}

	@Override
	public double calculatePrice() {
		
		double totalPrice ;
		
		if(this.isHaveSoat()==true) {
			
			totalPrice = (this.getBasePrice()*percentageHybridCar) + this.getSellPrice();
		}else {
		
		totalPrice = ((this.getBasePrice()*percentageHybridCar) + this.getSellPrice()) + expiredDocumentation;
		
		}
		
		if(this.isNewOrUsed()==false) {
			
			totalPrice = totalPrice * carUsed;
		}
		
		return totalPrice;
	}
	
	@Override
	public String toString() {

		return "Hybrid car info:" + "\nBrand:" + getBrand() + "\nModel" + getModel() + "\nLincense Plate:"
				+ getLicensePlate() + "\nGasoline type:" + getGasolineType() + "\nConsume:" + consume + "\nElectric Consume:" + consumekw + "\nTotal price:" + calculatePrice();
	}

}
