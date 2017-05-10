package strategy;

/**
 * Created by thomasmcgarry on 08/05/2017.
 */
public class Bird extends Animal{

    public Bird(){
        super();
        setSound("Tweet");
        flyingType = new ItFlys();
    }

}
