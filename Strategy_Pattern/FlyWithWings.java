package Strategy_Pattern;

public class FlyWithWings implements FlyBehavior{
	
	@Override
	public void fly() {
		//this is a stupid way to represent a duck flying but it's for the sake of the example
		System.out.printf("flap flap flap%n");
	}

}
