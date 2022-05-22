package ui;

import java.util.Scanner;

import model.ConcessionaireController;
import model.Date;
import model.TypeGasoline;
import model.TypeMotocycle;

public class ConcessionaireManager {

	private static Scanner sc;
	private static ConcessionaireController controller;

	public static void main(String[] args) {

		System.out.println("Welcome to the Concessionaire Software");
		init();

		int option = 0;

		do {
			option = showMenu();
			menu(option);

		} while (option != 0);

	}
	
	/**
	* @deprecated Metodo usado para inicializar el escaner y la controladora
	*/

	public static void init() {
		sc = new Scanner(System.in);
		controller = new ConcessionaireController();
	}
	
	/**
	* @deprecated Metodo usado para crear un menu

	*/

	public static int showMenu() {
		int option = 0;

		System.out.println("Please pick an option\n" + "(1) Register a vehicle" + "\n(2) Register a Document"
				+ "\n(3) Show Documents" + "\n(4) Show total price vehicle" + "\nShow infor of vehicles");
		option = sc.nextInt();
		sc.nextLine();
		return option;
	}

	public static void menu(int operation) {

		switch (operation) {
		case 0:
			System.out.println("Thanks for using our services!");
			break;
		case 1:

			registerVehicle();
			break;
		case 2:
			registerDocument();
			break;

		case 3:
			showCodes();
			break;

		case 4:
			totalPriceVehicle();
			break;

		case 5:
			showInfoManager();
			break;

		default:
			System.out.println("Error, type a valid option");

		}

	}
	
	/**
	* @deprecated Metodo usado para registrar un vehiculo
	*/

	public static void registerVehicle() {

		System.out.println("To register a vehicle please complete the folowing information: ");
		System.out.println("Type the base price of the vehicle");
		double basePrice = sc.nextDouble();
		sc.nextLine();
		System.out.println("Type the sell price of the vehicle");
		double sellPrice = sc.nextDouble();
		sc.nextLine();
		System.out.println("Type the brand of the vehicle");
		String brand = sc.nextLine();
		sc.nextLine();
		System.out.println("Type the model of the vehicle");
		String model = sc.nextLine();
		sc.nextLine();
		System.out.println("Type the cilyndry capacity of the vehicle");
		double cilyndryCapacity = sc.nextDouble();
		sc.nextLine();
		System.out.println("Type the km traveled of the vehicle");
		double km = sc.nextDouble();
		sc.nextLine();
		System.out.println("The vehicle have soat and techno Mecanical on day: " + "\n1.Yes" + "\n2.No");
		int haveSoatInt = sc.nextInt();
		boolean haveSoat = false;

		switch (haveSoatInt) {

		case 1:

			haveSoat = true;
			break;

		case 2:

			haveSoat = false;
			break;

		}
		System.out.println("The vehicle is new or used: " + "\n1.New " + "\n2.Used");
		int used = sc.nextInt();
		sc.nextLine();
		boolean newOrUsed = true;
		switch (used) {
		case 1:

			newOrUsed = true;
			break;
		case 2:
			newOrUsed = false;
			break;
		}
		System.out.println("Type the license plate of the vehicle");
		String licensePlate = sc.nextLine();

		System.out.println("Your vehicle is:/n1.Car /n2.Motocycle");
		int typeOption = sc.nextInt();
		boolean typeVehicle = false;
		if(typeOption ==1 ) {
			
			typeVehicle = true;
		} else {
			
			typeVehicle = false;
		}
		
		sc.nextLine();
		switch (typeOption) {

		case 1:

			System.out.println("Your car is: \n1.Sedan \n2.Truck");
			int typeCar = sc.nextInt();
			sc.nextLine();
			boolean type = true;
			switch (typeCar) {

			case 1:

				type = true;
				System.out.println("You car is Sedan");
				break;
			case 2:

				type = false;
				System.out.println("Your car is Truck");

			}

			System.out.println("Type the quantity of doors of the car: ");
			int doorsNumber = sc.nextInt();
			sc.nextLine();
			System.out.println("Type 1 if your windows are polarized, 2 if not");
			int windowsDe = sc.nextInt();
			sc.nextLine();
			boolean windows = true;
			switch (windowsDe) {

			case 1:

				windows = true;
				break;

			case 2:

				windows = false;
				break;
			}

			System.out.println("Type what type of car is:" + "\n1.Gasoline" + "\n2.Electric" + "\n3.Hybrid");
			int typeCarTwo = sc.nextInt();
			sc.nextLine();
			switch (typeCarTwo) {

			case 1:

				System.out.println("Type the capacity of the car: ");
				double capacity = sc.nextDouble();
				sc.nextLine();
				System.out.println("Type what type of gasoline is:" + "\n1.Regular" + "\n2.Extra" + "\n3.Diesel");
				String typeGasolineString = sc.nextLine();

				switch (Integer.valueOf(typeGasolineString)) {

				case 1:

					typeGasolineString = "REGULAR";
					break;
				case 2:

					typeGasolineString = "EXTRA";
					break;
				case 3:

					typeGasolineString = "DIESEL";
					break;
				}

				TypeGasoline typeGasoline = TypeGasoline.valueOf(typeGasolineString);

				if (controller.registerGasolineCar(basePrice, sellPrice, brand, model, cilyndryCapacity, km, newOrUsed,
						licensePlate, haveSoat, type, doorsNumber, windows, capacity, typeGasoline,typeVehicle)) {

					System.out.println("Your gasoline car is succesfully registered");
				} else {

					System.out.println("Your gasoline car cant be registered");
				}

				break;

			case 2:

				System.out.println("Type an option depending od your type of charger:" + "\n1.Normal charger"
						+ "\n2.Faster charger");
				int typeChargerDecition = sc.nextInt();
				sc.nextLine();
				boolean typeCharger = true;

				switch (typeChargerDecition) {

				case 1:

					typeCharger = true;
					break;
				case 2:

					typeCharger = false;
					break;
				}

				System.out.println("Type the duration of the duration of the battery in km");
				double duration = sc.nextDouble();

				if (controller.registerElectricCar(basePrice, sellPrice, brand, model, cilyndryCapacity, km, newOrUsed,
						licensePlate, haveSoat, type, doorsNumber, windows, typeCharger, duration,typeVehicle)) {

					System.out.println("Electric car registered succesfully");

				} else {

					System.out.println("Electric car cant be registered");
				}

				break;

			case 3:

				System.out.println("Type the capacity of the car: ");
				double capacityHybrid = sc.nextDouble();
				sc.nextLine();
				System.out.println("Type what type of gasoline is:" + "\n1.Regular" + "\n2.Extra" + "\n3.Diesel");
				String typeGasolineString2 = sc.nextLine();

				switch (Integer.valueOf(typeGasolineString2)) {

				case 1:

					typeGasolineString2 = "REGULAR";
					break;
				case 2:

					typeGasolineString2 = "EXTRA";
					break;
				case 3:

					typeGasolineString2 = "DIESEL";
					break;
				}

				TypeGasoline gasolineType = TypeGasoline.valueOf(typeGasolineString2);

				System.out.println("Type an option depending od your type of charger:" + "\n1.Normal charger"
						+ "\n2.Faster charger");
				int typeChargerDecition2 = sc.nextInt();
				boolean typeChargerHybrid = true;

				switch (typeChargerDecition2) {

				case 1:

					typeCharger = true;
					break;
				case 2:

					typeCharger = false;
					break;
				}

				System.out.println("Type the duration of the duration of the battery in km");
				double durationHybrid = sc.nextDouble();

				if (controller.registerHybridCar(basePrice, sellPrice, brand, model, cilyndryCapacity, km, newOrUsed,
						licensePlate, haveSoat, type, doorsNumber, windows, capacityHybrid, gasolineType,
						typeChargerHybrid, durationHybrid,typeVehicle)) {

					System.out.println("Hybrid car registered succesfully");

				} else {

					System.out.println("Hybrid car cant be registered");
				}
			}

			break;

		case 2:

			System.out.println(
					"Type what type of motocycle is:" + "\n1.Standar" + "\n2.Sporty" + "\n3.Scooter" + "\n4.Cross");
			String typeMotocycle = sc.nextLine();

			switch (Integer.valueOf(typeMotocycle)) {
			case 1:

				typeMotocycle = "STANDAR";
				break;

			case 2:

				typeMotocycle = "SPORTY";
				break;

			case 3:

				typeMotocycle = "SCOOTER";
				break;

			case 4:

				typeMotocycle = "CROSS";
				break;

			}

			System.out.println("Your motocycle is type " + typeMotocycle);

			TypeMotocycle typeMoto = TypeMotocycle.valueOf(typeMotocycle);

			System.out.println("Type the capacity of gasoline ");
			double capacity = sc.nextDouble();

			if (controller.registerMotocycle(basePrice, sellPrice, brand, model, cilyndryCapacity, km, newOrUsed,
					licensePlate, haveSoat, typeMoto, capacity,typeVehicle)) {

				System.out.println("Motocycle registered succesfully");

			} else {

				System.out.println("Motocycle cant be registered");
			}
			break;

		}

	}
	
	/**
	* @deprecated Metodo usado para registrar un documento 
	*/

	public static void registerDocument() {

		System.out.println("This are the list of the vehicles registered in the system");

		System.out.println(controller.showVehicles());

		System.out.println("Type the vehicle brand you want to register the document");

		String vehicleBrand = sc.nextLine();

		System.out.println("Type the vehicle model you want to register the document");

		String vehicleModel = sc.nextLine();

		System.out.println("Type the price of the document");

		double price = sc.nextDouble();

		System.out.println("Please enter the day you get the document");

		int day = sc.nextInt();

		System.out.println("Please enter the month you get the document");

		int month = sc.nextInt();

		System.out.println("Please enter the year you get the document");

		int year = sc.nextInt();

		Date date = new Date(day, month, year);

		System.out.println("Type the type of document you want to registered:" + "\n1.Soat " + "\n2.Techno Mecanical"
				+ "\n3.Property Card");

		int typeDocument = sc.nextInt();

		switch (typeDocument) {
		case 1:

			System.out.println("Type accident coverage amount ");
			double amount = sc.nextDouble();
			controller.registerSoat(vehicleModel, vehicleBrand, price, date, amount);
			break;

		case 2:

			System.out.println("Type the gas levels of the vehicle");
			double gasLevel = sc.nextDouble();
			controller.registerTechnoMecanical(vehicleBrand, vehicleModel, price, date, gasLevel);
			break;

		case 3:
			controller.registerPropertyCard(vehicleBrand, vehicleModel, price, date);
			break;
		}

		if (controller.registerDocument(vehicleBrand, vehicleModel, price, date)) {

			System.out.println("Document registered succesfully");

		} else {

			System.out.println("Document cant be registered");
		}
	}
	
	/**
	* @deprecated Metodo usado para mostrar el precio final de un vehiculo en especifico
	*/

	public static void totalPriceVehicle() {

		System.out.println("This are the list of the vehicles registered in the system");

		System.out.println(controller.showVehicles());

		System.out.println("Type the vehicle brand you want to register the document");

		String vehicleBrand = sc.nextLine();

		System.out.println("Type the vehicle model you want to register the document");

		String vehicleModel = sc.nextLine();

		controller.showTotalPrice(vehicleBrand, vehicleModel);

		System.out.println("Total Price: \n" + controller.showTotalPrice(vehicleBrand, vehicleModel));

	}
	
	/**
	* @deprecated Metodo usado para mostrar informes de vehiculos segun interes del usuario
	*/

	public static void showInfoManager() {

		System.out.println(
				"Type an option " + "\n(1) Type of vehicle" + "\n(2) Type pf gasoline " + "\n(3) New or used ");
		int desitionInfo = sc.nextInt();
		boolean typeOfVehicle = false;
		boolean newOrUsed = false;
		
		switch (desitionInfo) {
		case 1:
			System.out.println("What type is the vehicle" + "\n(1) Car" + "\n(2) Motocycle");
			int desitionVehicle = sc.nextInt();
			switch (desitionVehicle) {
			case 1:
				typeOfVehicle = true;
				break;
			case 2:
				typeOfVehicle = false;
				break;
			}
			
			System.out.println(controller.showInfo(typeOfVehicle, null, newOrUsed));

			break;
		case 2:
			System.out.println("What type of gasoline is: " + "\n(1) Regular" + "\n(2) Extra" + "\n(3) Diesel");
			String typeGasoline = sc.nextLine();
			sc.nextLine();
			switch (Integer.valueOf(typeGasoline)) {
			
			case 1:

				typeGasoline = "REGULAR";
				break;

			case 2:

				typeGasoline = "EXTRA";
				break;

			case 3:

				typeGasoline = "DIESEL";
				break;
			}
			
			TypeGasoline gasolineType = TypeGasoline.valueOf(typeGasoline);
			
			System.out.println(controller.showInfo(typeOfVehicle, gasolineType, newOrUsed));
				
			break;	

		case 3:

			System.out.println("The vehicle is: " + "\n(1) New" + "\n(2) Used");
			int desitionNew = sc.nextInt();
			switch (desitionNew) {
			case 1:
				newOrUsed = true;
				break;
			case 2:
				newOrUsed = false;
				break;
			}
			
			System.out.println(controller.showInfo(typeOfVehicle, null, newOrUsed));
			
			break;
		}
		
		
				
	}
	
	/**
	* @deprecated Metodo usado para mostrar ek codigo del soat
	*/
	
	public static void showCodes() {
		
		System.out.println("Type the license plate of the vehicle");
		String licensePlate = sc.nextLine();
		
		System.out.println(controller.showDocuments(licensePlate));
		
		
	}

}
