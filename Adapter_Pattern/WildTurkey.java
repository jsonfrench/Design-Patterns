package Adapter_Pattern;

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.printf("Gobble gobble!%n");
    }    

    @Override
    public void fly() {
        System.out.printf("I'm flying a short distance%n");
    }

}
