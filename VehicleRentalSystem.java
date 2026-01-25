package assignmentGrowSillIT;

class Vehicle {
	String vehicleId;
	String brand;
	boolean isAvailable;
	static int totalVehiclesCreated = 0;
	final double baseRentalPrice;

	public Vehicle() {
		this.baseRentalPrice = 0;
		totalVehiclesCreated++;
	}

	public Vehicle(String vehicleId, String brand, boolean isAvailable, double baseRentalPrice) {

		this.baseRentalPrice = baseRentalPrice;
		this.vehicleId = vehicleId;
		this.brand = brand;
		this.isAvailable = isAvailable;
		totalVehiclesCreated++;

	}

	double calculateRent(int days) {
		return baseRentalPrice;

	}

	void ShowDetails() {
		System.out.println("VehicleID:" + vehicleId + "| " + "Brand:"

				+ brand + "|" + "AvailableDetails:" + isAvailable + "|" +

				"BaseRent:" + baseRentalPrice);
	}

}

class Car extends Vehicle {
	int seatingCapacity;
	boolean isAC;

	public Car(String vehicleId, String brand, boolean isAvailable, double baseRentalPrice, int seatingCapacity,
			boolean isAC) {
		super(vehicleId, brand, isAvailable, baseRentalPrice);
		this.seatingCapacity = seatingCapacity;
		this.isAC = isAC;
	}

	public Car(String vehicleId, String brand, boolean isAvailable, double baseRentalPrice) {
		super(vehicleId, brand, isAvailable, baseRentalPrice);
		this.seatingCapacity = 0;
		this.isAC = false;
	}

	double calculateRent(int days) {
		int totalrent = (int) baseRentalPrice + 20 * days;
		return totalrent;

	}

	void ShowDetails() {
		super.ShowDetails();
		System.out.println("SeatingCapacity:" + "|" +

				seatingCapacity + "|" + "Ac Available:" + isAC

		);
	}

}

class Bike extends Vehicle {

	int engineCC;
	boolean hasGear;

	public Bike(String vehicleId, String brand, boolean isAvailable, double baseRentalPrice, int engineCC,
			boolean hasGear) {
		super(vehicleId, brand, isAvailable, baseRentalPrice);
		this.engineCC = engineCC;
		this.hasGear = hasGear;
	}

	double calculateRent(int days) {
		int totalrent = (int) baseRentalPrice + 10 * days;
		return totalrent;

	}

	public Bike(String vehicleId, String brand, boolean isAvailable, double baseRentalPrice) {
		super(vehicleId, brand, isAvailable, baseRentalPrice);
		this.engineCC = 0;
		this.hasGear = false;
	}

	void ShowDetails() {
		super.ShowDetails();
		System.out.println("EnginCC:" + "|" +

				engineCC + "|" + "ItHasGear:" + hasGear

		);
	}

}

public class VehicleRentalSystem {

	public static void main(String[] args) {

		Car carobj = new Car("B0123", "Honda", true, 500, 4, true);
		Car carobj1 = new Car("B2002", "Hyundai", true, 400, 6, true);
		Bike bikeobj = new Bike("PT03", "Herohonda", true, 500, 100, true);
		Bike bikeobj1 = new Bike("PT04", "Yamaha", true, 500, 500, true);

		// PrintDetails of each vehicle
		carobj.ShowDetails();
		carobj1.ShowDetails();
		bikeobj.ShowDetails();
		bikeobj1.ShowDetails();

		// Print Rent for 5days each vehicle
		System.out.println("Car Rent (5days): " + carobj.calculateRent(5));
		System.out.println("Bike Rent (5days): " + bikeobj.calculateRent(5));

		// print totalVehicle created
		System.out.println("Total Vehicle: " + Vehicle.totalVehiclesCreated);

	}

}
