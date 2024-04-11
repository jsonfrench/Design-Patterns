package Strategy_Pattern;

public class RubberDuck extends Duck{
	
	public RubberDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
		
	public void display() {
		System.out.printf("-OvO-%n");
	}

}
