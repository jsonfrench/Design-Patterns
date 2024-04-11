package Strategy_Pattern;

public class DuckTester {
	public static void main(String[] args) {
		
		Duck mallard = new MallardDuck();
		Duck rubber = new RubberDuck();

		//mallard
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
		
		//rubber duck
		rubber.display();
		rubber.performQuack();
		rubber.performFly();
		
	}	
}
