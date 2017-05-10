package strategy;

/**
 * Created by thomasmcgarry on 08/05/2017.
 */
public class AnimalPlay {

    public static void main(String[] args){

        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());
        System.out.println("Bird: " + tweety.tryToFly());

        sparky.setFlyingAbility(new ItFlys());

        //you can change dynamically
        System.out.println("Dog: " + sparky.tryToFly());

    }

}
