package G3lab7q1;

public abstract class Bike implements Vehicle {

	@Override
	public Engine engine() {
		return new BikeEngine();
	}
	
	@Override
	public void showDetails()
	{
		System.out.println("Bike Details:");
		System.out.print("Company: "+ this.company() + ", ");
		System.out.print("Price: "+ this.price() + ", ");
		System.out.println("Engine: "+ this.engine().type());

	}
}
