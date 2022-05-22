package model;

import java.util.ArrayList;

public class ConcessionaireController {

	private ArrayList<Vehicle> vehicles;

	private Parking[][] matrixParking;

	public ConcessionaireController() {

		this.vehicles = new ArrayList<Vehicle>();

		matrixParking = new Parking[10][5];
	}
	
	/**
	* @deprecated Metodo usado para registrar una motocicleta
	* @param basePrice precio base
	* @param sellPrice precio de venta
	* @param brand marca
	* @param model modelo
	* @param cilindryCapacity capacidad del cilindro
	* @param km kilometraje
	* @param newOrUsed vehiculo nuevo o usado
	* @param licensePlate id del vehiculo
	* @param haveSoat si tiene documentos al dia
	* @param typeMoto tipo de moto
	* @param capacity capacidad del vehiculo
	* @param typeVehicle tipo de vehiculo
	*/

	public boolean registerMotocycle(double basePrice, double sellPrice, String brand, String model,
			double cilyndryCapacity, double km, boolean newOrUsed, String licensePlate, boolean haveSoat,
			TypeMotocycle typeMoto, double capacity, boolean typeVehicle) {

		Motocycle myMotocycle = new Motocycle(basePrice, sellPrice, brand, model, cilyndryCapacity, km, newOrUsed,
				licensePlate, haveSoat, typeMoto, capacity, typeVehicle);
		
		registerVehicleBoolean(myMotocycle);

		return vehicles.add(myMotocycle);
	}
	
	/**
	* @deprecated Metodo usado para registrar un carro de gasolina
	* @param basePrice precio base
	* @param sellPrice precio de venta
	* @param brand marca
	* @param model modelo
	* @param cilindryCapacity capacidad del cilindro
	* @param km kilometraje
	* @param newOrUsed vehiculo nuevo o usado
	* @param licensePlate id del vehiculo
	* @param haveSoat si tiene documentos al dia
	* @param type tipo de carro
	* @param doorsNumber numero de puertas
	* @param windows poralizadas o no
	* @param capacity capacidad del vehiculo
	* @param gasolineType tipo de gasolina
	* @param typeOfVehicle tipo de vehiculo
	*/

	public boolean registerGasolineCar(double basePrice, double sellPrice, String brand, String model,
			double cilyndryCapacity, double km, boolean newOrUsed, String licensePlate, boolean haveSoat, boolean type,
			int doorsNumber, boolean windows, double capacity, TypeGasoline gasolineType, boolean typeVehicle) {

		GasolineCar myGasolineCar = new GasolineCar(basePrice, sellPrice, brand, model, cilyndryCapacity, km, newOrUsed,
				licensePlate, haveSoat, type, doorsNumber, windows, capacity, gasolineType, typeVehicle);

		registerVehicleBoolean(myGasolineCar);
		return vehicles.add(myGasolineCar);
	}
	
	/**
	* @deprecated Metodo usado para registrar un carro electrico
	* @param basePrice precio base
	* @param sellPrice precio de venta
	* @param brand marca
	* @param model modelo
	* @param cilindryCapacity capacidad del cilindro
	* @param km kilometraje
	* @param newOrUsed vehiculo nuevo o usado
	* @param licensePlate id del vehiculo
	* @param haveSoat si tiene documentos al dia
	* @param type tipo de carro
	* @param doorsNumber numero de puertas
	* @param windows poralizadas o no
	* @param typeCharger tipo de cargador
	* @param duration duracion del vehiculo
	* @param typeOfVehicle tipo de vehiculo
	*/

	public boolean registerElectricCar(double basePrice, double sellPrice, String brand, String model,
			double cilyndryCapacity, double km, boolean newOrUsed, String licensePlate, boolean haveSoat, boolean type,
			int doorsNumber, boolean windows, boolean typeCharger, double duration, boolean typeVehicle) {

		ElectricCar myElectricCar = new ElectricCar(basePrice, sellPrice, brand, model, cilyndryCapacity, km, newOrUsed,
				licensePlate, haveSoat, type, doorsNumber, windows, typeCharger, duration, typeVehicle);

		registerVehicleBoolean(myElectricCar);
		return vehicles.add(myElectricCar);

	}
	
	/**
	* @deprecated Metodo usado para registrar un carro de gasolina
	* @param basePrice precio base
	* @param sellPrice precio de venta
	* @param brand marca
	* @param model modelo
	* @param cilindryCapacity capacidad del cilindro
	* @param km kilometraje
	* @param newOrUsed vehiculo nuevo o usado
	* @param licensePlate id del vehiculo
	* @param haveSoat si tiene documentos al dia
	* @param type tipo de carro
	* @param doorsNumber numero de puertas
	* @param windows poralizadas o no
	* @param capacity capacidad del vehiculo
	* @param gasolineType tipo de gasolina
	* @param typeCharger tipo de cargador
	* @param duration duracion del vehiculo
	* @param typeOfVehicle tipo de vehiculo
	*/

	public boolean registerHybridCar(double basePrice, double sellPrice, String brand, String model,
			double cilyndryCapacity, double km, boolean newOrUsed, String licensePlate, boolean haveSoat, boolean type,
			int doorsNumber, boolean windows, double capacityHybrid, TypeGasoline gasolineType,
			boolean typeChargerHybrid, double durationHybrid, boolean typeVehicle) {

		HybridCar myHybridCar = new HybridCar(basePrice, sellPrice, brand, model, cilyndryCapacity, km, newOrUsed,
				licensePlate, haveSoat, type, doorsNumber, windows, capacityHybrid, gasolineType, typeChargerHybrid,
				durationHybrid, typeVehicle);

		registerVehicleBoolean(myHybridCar);
		return vehicles.add(myHybridCar);
	}
	
	/**
	* @deprecated Metodo usado para mostrar los vehiculos registrados
	*/

	public String showVehicles() {

		String vehiclesRegistered = "";

		for (int i = 0; i < vehicles.size(); i++) {

			if (vehicles == null) {

				System.out.println("There are not vehicles registered yet");

			} else {

				vehiclesRegistered += "\n" + (i + 1) + "." + "Brand:" + vehicles.get(i).getBrand() + "Model:"
						+ vehicles.get(i).getModel();

			}
		}

		return vehiclesRegistered;
	}
	
	/**
	* @deprecated Metodo usado para registrar un documento a un vehiculo
	* @param vehicleModel modelo del vehiculo al que se quiere registrar un documento
	* @param vehicleBrand marca del vehiculo al que se le quiere registrar un documento
	* @param price precio del documento
	* @param date fecha que se saco el documento
	*/

	public boolean registerDocument(String vehicleModel, String vehicleBrand, double price, Date date) {

		boolean stopFlag = false;

		for (int i = 0; i < vehicles.size(); i++) {
			if (vehicles.get(i).getModel().equalsIgnoreCase(vehicleModel)
					&& vehicles.get(i).getBrand().equalsIgnoreCase(vehicleBrand)) {

				stopFlag = vehicles.get(i).addDocument(price, date);
			}
		}

		return stopFlag;
	}
	
	/**
	* @deprecated Metodo usado para registrar un documento tipo soat 
	* @param vehicleModel modelo del vehiculo al que se quiere registrar un documento
	* @param vehicleBrand marca del vehiculo al que se le quiere registrar un documento
	* @param price precio del documento
	* @param amount suma de danos terceros 
	*/

	
	public boolean registerSoat(String vehicleBrand, String vehicleModel, double price, Date date, double amount) {

		boolean stopFlag = false;

		Soat mySoat = new Soat(price, date, amount);

		for (int i = 0; i < vehicles.size(); i++) {
			if (vehicles.get(i).getModel().equalsIgnoreCase(vehicleModel)
					&& vehicles.get(i).getBrand().equalsIgnoreCase(vehicleBrand)) {

				stopFlag = vehicles.get(i).getDocumentList().add(mySoat);
			}
		}

		return stopFlag;
	}
	
	/**
	* @deprecated Metodo usado para registrar un documento a un vehiculo
	* @param vehicleModel modelo del vehiculo al que se quiere registrar un documento
	* @param vehicleBrand marca del vehiculo al que se le quiere registrar un documento
	* @param price precio del documento
	* @param date fecha que se saco el documento
	* @param gasLevel niveles de gases del vehiculo
	*/

	public boolean registerTechnoMecanical(String vehicleBrand, String vehicleModel, double price, Date date,
			double gasLevel) {

		boolean stopFlag = false;

		TechnoMecanical myTechno = new TechnoMecanical(price, date, gasLevel);

		for (int i = 0; i < vehicles.size(); i++) {
			if (vehicles.get(i).getModel().equalsIgnoreCase(vehicleModel)
					&& vehicles.get(i).getBrand().equalsIgnoreCase(vehicleBrand)) {

				stopFlag = vehicles.get(i).getDocumentList().add(myTechno);
			}
		}

		return stopFlag;
	}
	
	/**
	* @deprecated Metodo usado para registrar un documento a un vehiculo
	* @param vehicleModel modelo del vehiculo al que se quiere registrar un documento
	* @param vehicleBrand marca del vehiculo al que se le quiere registrar un documento
	* @param price precio del documento
	* @param date fecha que se saco el documento
	*/

	public boolean registerPropertyCard(String vehicleBrand, String vehicleModel, double price, Date date) {

		boolean stopFlag = false;

		PropertyCard myCard = new PropertyCard(price, date);

		for (int i = 0; i < vehicles.size(); i++) {
			if (vehicles.get(i).getModel().equalsIgnoreCase(vehicleModel)
					&& vehicles.get(i).getBrand().equalsIgnoreCase(vehicleBrand)) {

				stopFlag = vehicles.get(i).getDocumentList().add(myCard);
			}
		}

		return stopFlag;
	}
	
	/**
	* @deprecated Metodo usado para mostrar numero del documento
	* @param licensePlate placa del vehiculo al que se quiere conocer el codigo
	*/

	public String showDocuments(String licensePlate) {

		String out = "";

		for (int i = 0; i < vehicles.size(); i++) {
			
			if(licensePlate.equals(vehicles.get(i).getLicensePlate())) {
				
				out = vehicles.get(i).showDocuments();
			}
		}

		return out;
	}
	
	/**
	* @deprecated Metodo usado para mostrar el precio total de venta de un vehiculo
	* @param vehicleModel modelo del vehiculo al que se quiere registrar un documento
	* @param vehicleBrand marca del vehiculo al que se le quiere registrar un documento
	*/

	public double showTotalPrice(String vehicleBrand, String vehicleModel) {
		double totalPrice = 0;

		for (int i = 0; i < vehicles.size(); i++) {

			if (vehicles.get(i).getModel().equalsIgnoreCase(vehicleModel)
					&& vehicles.get(i).getBrand().equalsIgnoreCase(vehicleBrand)) {

				if (vehicles.get(i).getClass() == Motocycle.class) {

					totalPrice = ((Motocycle) vehicles.get(i)).calculatePrice();

				}

				if (vehicles.get(i).getClass() == GasolineCar.class) {

					totalPrice = ((GasolineCar) vehicles.get(i)).calculatePrice();

				}

				if (vehicles.get(i).getClass() == ElectricCar.class) {

					totalPrice = ((ElectricCar) vehicles.get(i)).calculatePrice();

				}

				if (vehicles.get(i).getClass() == HybridCar.class) {

					totalPrice = ((HybridCar) vehicles.get(i)).calculatePrice();

				}
			}
		}
		return totalPrice;
	}
	
	/**
	* @deprecated Metodo usado para registrar un documento a un vehiculo
	* @param typeVehcile tipo de vehiculo 
	* @param gasolineType tipo de gasolina del vehiculo
	* @param newOrUsed nuevo o usado
	*/

	public String showInfo(boolean typeOfVehicle, TypeGasoline gasolineType, boolean newOrUsed) {
		String info = "";

		for (int i = 0; i < vehicles.size(); i++) {

			if (typeOfVehicle == true && vehicles.get(i).isTypeVehicle() == true) {

				if (vehicles.get(i).getClass() == Car.class) {

					Car myCar = (Car) vehicles.get(i);

					info = myCar.showInfoCar();
				}
			} else {

				if (vehicles.get(i).getClass() == Motocycle.class) {

					Motocycle myMoto = (Motocycle) vehicles.get(i);

					info = myMoto.showInfoMoto();
				}
			}

			if (vehicles.get(i).getClass() == GasolineCar.class) {
				
				GasolineCar myGasolineCar = (GasolineCar) vehicles.get(i);

				if (gasolineType == myGasolineCar.getGasolineType()) {
					if (myGasolineCar.getGasolineType().REGULAR != null) {
						info += myGasolineCar.toString();
					}
				}
				if (gasolineType == myGasolineCar.getGasolineType()) {
					if (myGasolineCar.getGasolineType().EXTRA != null) {
						info += myGasolineCar.toString();
					}
				}
				if (gasolineType == myGasolineCar.getGasolineType()) {
					if (myGasolineCar.getGasolineType().DIESEL != null) {
						info += myGasolineCar.toString();
					}
				}
			}
			
			if (vehicles.get(i).getClass() == HybridCar.class) {
				
				HybridCar myHybridCar = (HybridCar) vehicles.get(i);

				if (gasolineType == myHybridCar.getGasolineType()) {
					if (myHybridCar.getGasolineType().REGULAR != null) {
						info += myHybridCar.toString();
					}
				}
				if (gasolineType == myHybridCar.getGasolineType()) {
					if (myHybridCar.getGasolineType().EXTRA != null) {
						info += myHybridCar.toString();
					}
				}
				if (gasolineType == myHybridCar.getGasolineType()) {
					if (myHybridCar.getGasolineType().DIESEL != null) {
						info += myHybridCar.toString();
					}
				}
			}
			
			if(newOrUsed == true) {
				if(vehicles.get(i).isNewOrUsed() == true) {
					
					info += vehicles.get(i).toString();
				} else {
					info += vehicles.get(i).toString();
					
				}
				
			}

		}

		return info;
	}
	
	/**
	* @deprecated Metodo usado para llenar la matriz de false 
	*/
	
	public void fillMatrix() {
		
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<5;j++) {

				
				matrixParking[i][j] = new Parking(false,null);
	
			}
			
		}
	}
	
	/**
	* @deprecated Metodo usado para cambiar el false por el true cada que se anade un vehiculo
	* @param vehicleIn se le pasa un vehiculo cada vez que re realiza un registro
	*/
	
	public boolean registerVehicleBoolean(Vehicle vehicleIn) {
		
		boolean vehicleAdd = false;
		for(int i=0;i<10;i++) {
			for(int j=0;j<5;j++) {
				
				if(!matrixParking[i][j].isOcuppy() && !vehicleAdd) {
					
					matrixParking[i][j].setOcuppy(true);
					
					matrixParking[i][j].setVehicleIn(vehicleIn);
			
					vehicleAdd = true;
				}
			}
			
		}
		
		return vehicleAdd;
	}
	
	/**
	* @deprecated Metodo usado para crear una matriz de tipo boolean y cada vez que este ocupada la posicion ponerlo true
	*/
	
	public String printMatrix() {
		
		boolean[][] matrixOcuppy = new boolean[10][5];
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<5;j++) {
				
				if(matrixParking[i][j].isOcuppy()) {
					
					matrixOcuppy[i][j] = true;
				}
			}
		}
		
		return printImage(matrixOcuppy);
	}
	
	/**
	* @deprecated Metodo usado para mostrar la matriz boolean
	* @param matrixOcuppy  matrix boolean 
	*/
	
	private String printImage(boolean[][]matrixOcuppy) {
		String print = "";
		for (int i = 0; i <10; i++) {
			for (int j = 0; j < 5; j++) {
				print += matrixOcuppy[i][j] + " ";
			}
			print += "\n";
		}
		return print;
	}
	
}
