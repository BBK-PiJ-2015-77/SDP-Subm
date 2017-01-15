/**
 * Created by thomasmcgarry on 12/01/2017.
 */

//testing for git, ...again
public class Driver {

    public static void main(String[] args) {

        Storage<BankAccount>  aStorage = new Storage<>();
        Storage<String>       sStorage = new Storage<>();

        Class<BankAccount> baCls = BankAccount.class;

        try {
            //casting like this is known as dynamic casting and is performed by the JVM
            BankAccount myAccount =  (BankAccount) baCls.newInstance();
            aStorage.setValue(myAccount);

            // Deposit
            myAccount.deposit(15);
        }

        catch ( InstantiationException e ) {
            // ...
        }

        catch ( IllegalAccessException e ) {
        // ...
        }

    }

}
