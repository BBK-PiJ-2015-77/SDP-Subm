package factory;

/**
 * Created by thomasmcgarry on 05/03/2017.
 */
public class House extends ConcreteProduct {

    @Override
    public String getDescription() { return "House"; }

    @Override
    public double getCost() { return 150.0; }

    public int getWindows() { return 8; }


}