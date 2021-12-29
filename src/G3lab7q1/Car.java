package G3lab7q1;

public abstract class Car implements Vehicle {

	@Override
	public Engine engine() {
		return new CarEngine();
	}

	@Override
	public void showDetails()
	{
		System.out.println("Car Details:");
		System.out.print("Company: "+ this.company() + ", ");
		System.out.print("Price: "+ this.price() + ", ");
		System.out.println("Engine: "+ this.engine().type());

	}
}
