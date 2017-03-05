package factory;

/**
 * Created by thomasmcgarry on 05/03/2017.
 */
public class Creator {

    public Product makeProduct(){
        return new ConcreteProduct();
    }

}