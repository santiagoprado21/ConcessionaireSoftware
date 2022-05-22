package model;

public class Motocycle extends Vehicle implements CalculateConsume, CalculatePriceVehicle {

	private TypeMotocycle typeMoto;
	private double capacity;
	private double consume;

	public Motocycle(double basePrice, double sellPrice, String brand, String model, double cilyndryCapacity, double km,
			boolean newOrUsed, String licensePlate, boolean haveSoat, TypeMotocycle typeMoto, double capacity,
			boolean typeVehicle) {
		super(basePrice, sellPrice, brand, model, cilyndryCapacity, km, newOrUsed, licensePlate, haveSoat, typeVehicle);

		this.typeMoto = typeMoto;
		this.capacity = capacity;
		this.consume = consume;

	}

	public TypeMotocycle getType() {
		return typeMoto;
	}

	public void setType(TypeMotocycle typeMoto) {
		this.typeMoto = typeMoto;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getConsume() {
		return consume;
	}

	public void setConsume(double consume) {
		this.consume = consume;
	}

	@Override
	public double calculateConsume() {

		consume = this.getCapacity() * (this.getCilyndryCapacity() / motocycle);

		return consume;
	}

	@Override
	public double calculatePrice() {

		double totalPrice;

		if (this.isHaveSoat() == true) {

			totalPrice = (this.getSellPrice() * motocycleUp) + this.getSellPrice();
		} else {

			totalPrice = ((this.getSellPrice() * motocycleUp) + this.getSellPrice()) + expiredDocumentation;

		}

		if (this.isNewOrUsed() == false) {

			totalPrice = totalPrice * motocycleUsed;
		}

		return totalPrice;
	}

	public String showInfoMoto() {

		String info = "";
		int number = 1;

		info += "Motocycle: \n" + "Brand:" + getBrand() + "\nModel:" + getModel() + "\nBase Price:" + getBasePrice()
				+ "\nSell price:" + getSellPrice() + "\nCilindry Capacity:" + getCilyndryCapacity() + "\nKm:" + getKm()
				+ "\nLicense Plate:" + getLicensePlate() + "\nType: " + getType() + "\nCapacity: " + getCapacity()
				+ "Total Price:" + calculatePrice();

		return info;
	}

}
