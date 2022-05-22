package model;

public class Parking {
	
	private boolean ocuppy;
	private Vehicle vehicleIn;
	
	public Parking(boolean ocuppy,Vehicle vehicleIn) {
		
		this.ocuppy = ocuppy;
		this.vehicleIn = vehicleIn;
		
	}

	public boolean isOcuppy() {
		return ocuppy;
	}

	public void setOcuppy(boolean ocuppy) {
		this.ocuppy = ocuppy;
	}

	public Vehicle getVehicleIn() {
		return vehicleIn;
	}

	public void setVehicleIn(Vehicle vehicleIn) {
		this.vehicleIn = vehicleIn;
	}

}
