package factory;

/**
 * Created by thomasmcgarry on 05/03/2017.
 */
public class Office extends ConcreteProduct {

    @Override
    public String getDescription() { return "Office"; }

    @Override
    public double getCost() { return 300.0; }

    public int getWindows() { return 100; }


}