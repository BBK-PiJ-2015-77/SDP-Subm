package factory;

/**
 * Created by thomasmcgarry on 05/03/2017.
 */
public class Creator {

    public Product makeProduct(String newProduct){

        if (newProduct.equals("H")) {
            return new House();
        } else if (newProduct.equals("O")) {
            return new Office();
        } else return null;

    }

    public Product makeProduct() {
        return new ConcreteProduct();
    }

}