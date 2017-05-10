package strategy;

/**
 * Created by thomasmcgarry on 08/05/2017.
 */
public interface Flys {

    String fly();

}

class ItFlys implements Flys{

    @Override
    public String fly() {
        return "Flying high";
    }

}

class CantFly implements Flys{

    @Override
    public String fly() {
        return "I can't fly";
    }

}