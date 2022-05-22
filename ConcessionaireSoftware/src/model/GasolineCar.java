package model;

public class GasolineCar extends Car implements CalculateConsume, CalculatePriceVehicle {

	private double capacity;
	private TypeGasoline gasolineType;
	private double consume;

	public GasolineCar(double basePrice, double sellPrice, String brand, String model, double cilyndryCapacity,
			double km, boolean newOrUsed, String licensePlate, boolean haveSoat, boolean type, int doorsNumber,
			boolean windows, double capacity, TypeGasoline gasolineType, boolean typeVehicle) {
		super(basePrice, sellPrice, brand, model, cilyndryCapacity, km, newOrUsed, licensePlate, haveSoat, type,
				doorsNumber, windows, typeVehicle);

		this.capacity = capacity;
		this.gasolineType = gasolineType;
		this.consume = consume;

	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
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

	@Override
	public String toString() {

		return "Gasoline Car info:" + "\nBrand:" + getBrand() + "\nModel" + getModel() + "\nLincense Plate:"
				+ getLicensePlate() + "\nGasoline type:" + getGasolineType() + "\nConsume:" + consume + "\nTotal price:" + calculatePrice();
	}

	@Override
	public double calculateConsume() {

		double consume = this.getCapacity() * (this.getCilyndryCapacity() / gasolineCar);

		return consume;
	}

	@Override
	public double calculatePrice() {

		double totalPrice;

		if (this.isHaveSoat() == true) {

			totalPrice = this.getSellPrice();
		} else {

			totalPrice = this.getSellPrice() + expiredDocumentation;
		}

		if (this.isNewOrUsed() == false) {

			totalPrice = totalPrice * carUsed;
		}

		return totalPrice;
	}

}
