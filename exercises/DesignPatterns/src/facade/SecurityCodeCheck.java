package facade;

/**
 * Created by thomasmcgarry on 13/05/2017.
 */
public class SecurityCodeCheck {

    private int securityCode = 1234;

    public int getSecurityCode(){
        return securityCode;
    }

    public boolean isCodeCorrect(int secCodeToCheck){
        if(secCodeToCheck == getSecurityCode()) {
            return true;
        } else {
            return false;
        }
    }

}
