package G3lab7q1;

public class CarBuilderDemo {
	public static void main(String[] args) {
		VehicleBuilder vehicleBuilder = new VehicleBuilder();

		Bike bike = vehicleBuilder.makeBike();
		bike.showDetails();

		System.out.println();
		
		Car car = vehicleBuilder.makeCar();
		car.showDetails();
		
	}
}
