package Strategy_Pattern;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
		
	public void display() {
		System.out.printf("-.,=-%n"); // ASCII art only goes so far, eh?
	}

}
