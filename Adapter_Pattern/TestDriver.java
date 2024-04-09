package Adapter_Pattern;

public class TestDriver {
    public static void main(String args []) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        Duck turkey_to_duck = new TurkeyToDuck(turkey);
        Turkey duck_to_turkey = new DuckToTurkey(duck);

        //Test Duck methods:
        System.out.printf("Duck methods:%n");
        duck.quack();
        duck.fly();

        //Test Turkey methods:
        System.out.printf("Turkey methods:%n");
        turkey.gobble();
        turkey.fly();

        //Test Turkey Adapter
        System.out.printf("Duck and turkey_to_duck methods:%n");
        testDuck(duck);
        testDuck(turkey_to_duck);


        //Test Duck Adapter
        System.out.printf("Turkey and duck_to_turkey methods:%n");
        testTurkey(turkey);
        testTurkey(duck_to_turkey);
        
    }

    static void testDuck(Duck duck) {   //quick method to test all duck methods without having to manually call each of them every time
        duck.quack();
        duck.fly();
    }

    static void testTurkey(Turkey turkey) {  //another tester method for turkey methods
        turkey.gobble();
        turkey.fly();
    }

}
