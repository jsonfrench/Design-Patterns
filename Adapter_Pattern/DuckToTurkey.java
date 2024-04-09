package Adapter_Pattern;
import java.util.Random;

public class DuckToTurkey implements Turkey{
    Duck duck;
    Random rand = new Random();

    public DuckToTurkey(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void fly() {                     //how am i supposed to adapt a duck's flight to a turkey's flight?
        if (rand.nextInt(5)==0){      //i was originally going to have a counter keep track of how many times the fly()   
            duck.fly();                     //method was called, and do fly() every 5th call. 
        }                                   //this implementation is actually better, because if multiple people are calling the 
    }                                       //fly() method at the same time, they should get an equal amount of flight

    @Override
    public void gobble() {
        duck.quack();
    }
    
}
