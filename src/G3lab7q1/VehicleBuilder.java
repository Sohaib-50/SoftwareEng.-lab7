package G3lab7q1;

public class VehicleBuilder {	
	public Car makeCar()
	{
		Car car = new Swift();
		return car;
	}
	public Bike makeBike() {
		Bike bike = new CD70();
		return bike;
	}
}

