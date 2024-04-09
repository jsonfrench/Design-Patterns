package Adapter_Pattern;

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.printf("quack!%n");
    }

    @Override
    public void fly() {
        System.out.printf("I'm flying!%n");
    }
    
}
