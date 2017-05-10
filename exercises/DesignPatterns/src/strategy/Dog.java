package strategy;

/**
 * Created by thomasmcgarry on 08/05/2017.
 */
public class Dog extends Animal{

    public void digHole(){
        System.out.println("Dug a hole");
    }

    public Dog(){
        super();
        setSound("Bark");
        flyingType = new CantFly();
    }

}
