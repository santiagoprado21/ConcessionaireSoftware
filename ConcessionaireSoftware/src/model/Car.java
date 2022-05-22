package model;

public class Car extends Vehicle {

	private boolean type;
	private int doorsNumber;
	private boolean windows;

	public Car(double basePrice, double sellPrice, String brand, String model, double cilyndryCapacity, double km,
			boolean newOrUsed, String licensePlate,boolean haveSoat, boolean type, int doorsNumber, boolean windows,boolean typeVehicle) {
		super(basePrice, sellPrice, brand, model, cilyndryCapacity, km, newOrUsed, licensePlate,haveSoat,typeVehicle);

		this.type = type;
		this.doorsNumber = doorsNumber;
		this.windows = windows;

	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public int getDoorsNumber() {
		return doorsNumber;
	}

	public void setDoorsNumber(int doorsNumber) {
		this.doorsNumber = doorsNumber;
	}

	public boolean isWindows() {
		return windows;
	}

	public void setWindows(boolean windows) {
		this.windows = windows;
	}
	


	public String showInfoCar() {
		
		String info ="";
		String typeCar = "";
		String windowsP = "";
		if(isWindows() == true) {
			windowsP = "Yes";
		} else{
			windowsP ="No";
		}
		if(type == true) {	
			typeCar = "Sedan";
		} else {
			typeCar = "Truck";
		}
		
		
		info += "Cars: \n" + "Brand:" + getBrand() + "\nModel:"
				+ getModel() + "\nBase Price:" + getBasePrice()
				+ "\nSell price:" + getSellPrice() + "\nCilindry Capacity:"
				+ getCilyndryCapacity() + "\nKm:" + getKm() + "\nLicense Plate:"
				+ getLicensePlate() + "\nType" + typeCar +"\nNumbers of door:" + getDoorsNumber() + "\nWindows Poralized: " + windowsP;
		
		return info;
	}
}
