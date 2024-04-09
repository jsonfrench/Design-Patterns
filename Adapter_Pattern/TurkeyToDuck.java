package Adapter_Pattern;

public class TurkeyToDuck implements Duck {
    Turkey turkey;

    public TurkeyToDuck(Turkey turkey) {   //pass in the turkey that we want to adapt into a duck
        this.turkey = turkey;
    }

    @Override
    public void fly() { 
        for(int i=0; i<5; i++){             //adapt turkey's fly to a duck's fly
            turkey.fly();                   //since ducks fly farther, a turkey needs to fly multiple times to compensate
        }        
    }

    @Override
    public void quack() {                   
        turkey.gobble();                    //adapt turkey's gobble to a duck's quack
    }
    
}
