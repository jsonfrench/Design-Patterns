package Strategy_Pattern;

public class FlyNoWay implements FlyBehavior{
	
	public void fly() {
		// do nothing because this behavior represents not being able to fly.
		
		// in a different implementation we might actually want this to do something
		// like set the max y-position of the duck to zero.	
		;
	}

}
