package facade;

/**
 * Created by thomasmcgarry on 13/05/2017.
 */
public class AccountNumberCheck {

    private int accountNumber = 1234567;

    public int getAccountNumber(){
        return accountNumber;
    }

    public boolean accountActive(int accNumToCheck){
        if(accNumToCheck == getAccountNumber()) {
            return true;
        } else {
            return false;
        }
    }

}
