package model;

import java.util.ArrayList;

public class Vehicle {

	private double basePrice;
	private double sellPrice;
	private String brand;
	private String model;
	private double cilyndryCapacity;
	private double km;
	private boolean newOrUsed;
	private boolean haveSoat;
	private String licensePlate;
	private boolean typeVehicle;
	ArrayList<Document> documentList;

	public Vehicle(double basePrice, double sellPrice, String brand, String model, double cilyndryCapacity, double km,
			boolean newOrUsed, String licensePlate,boolean haveSoat,boolean typeVehicle) {
		this.basePrice = basePrice;
		this.sellPrice = sellPrice;
		this.brand = brand;
		this.model = model;
		this.cilyndryCapacity = cilyndryCapacity;
		this.km = km;
		this.newOrUsed = newOrUsed;
		this.licensePlate = licensePlate;
		this.haveSoat = haveSoat;
		this.documentList = new ArrayList<Document>();
		this.typeVehicle = typeVehicle;
	}
	


	public boolean addDocument(double price,Date year){

		Document myDoc = new Document(price,year);

		return documentList.add(myDoc);

	}
	

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCilyndryCapacity() {
		return cilyndryCapacity;
	}

	public void setCilyndryCapacity(double cilyndryCapacity) {
		this.cilyndryCapacity = cilyndryCapacity;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public boolean isNewOrUsed() {
		return newOrUsed;
	}

	public void setNewOrUsed(boolean newOrUsed) {
		this.newOrUsed = newOrUsed;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	
	public boolean isHaveSoat() {
		return haveSoat;
	}

	public void setHaveSoat(boolean haveSoat) {
		this.haveSoat = haveSoat;
	}
	
	public ArrayList<Document> getDocumentList() {
		return documentList;
	}

	public void setDocumentList(ArrayList<Document> documentList) {
		this.documentList = documentList;
	}
	
	public void setMatrixList(ArrayList<Document> documentList) {
		this.documentList = documentList;
	}
	
	public boolean isTypeVehicle() {
		return typeVehicle;
	}

	public void setTypeVehicle(boolean typeVehicle) {
		this.typeVehicle = typeVehicle;
	}
	
	public String showDocuments() {
		String toReturn = "";
		for (int j = 0; j <documentList.size(); j++) {
			toReturn += documentList.get(j).toString();
		}
		return toReturn;
		
	}
	
	public String typeDocument() {
		
		String type = "";
		for(int i = 0;i<documentList.size();i++) {
			
			if (documentList.get(i).getClass() == (Soat.class)) {
				
				type = "Soat";
			}
			if (documentList.get(i).getClass() == (TechnoMecanical.class)) {
				
				type = "Techno";
			}
			if (documentList.get(i).getClass() == (PropertyCard.class)) {
				
				type = "Property";
			}
			
		}
		return type;
	}
	
	@Override
	public String toString() {
		
		String newUsed ="";
		if(newOrUsed == true) {
			newUsed = "New";
		}else {
			newUsed ="Used";
		}

		return "Vehicle info:" + "\nBrand:" + getBrand() + "\nModel" + getModel() + "\nLincense Plate:"
				+ getLicensePlate() + "\nNew or Used:" + newUsed;
	}
	
}
