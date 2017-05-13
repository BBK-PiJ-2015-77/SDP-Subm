package facade;

/**
 * Created by thomasmcgarry on 13/05/2017.
 */
public class FundsCheck {

    private double cashInAccount = 1000.00;

    public double getCashInAccount(){
        return cashInAccount;
    }

    public void decreaseCashInAccount(double cashWithdrawn){
        cashInAccount -= cashWithdrawn;
    }

    public void increaseCashInAccount(double cashDeposited){
        cashInAccount += cashDeposited;
    }

    public boolean haveEnoughMoney(double cashToWithdraw){
        if(cashToWithdraw > getCashInAccount()){
            System.out.println("Error: You don't have enough money");
            System.out.println("Current Balance: " + getCashInAccount());
            return false;
        } else {
            decreaseCashInAccount(cashToWithdraw);
            System.out.println("Withdrawal complete. Current balance is: " + getCashInAccount());
            return true;
        }
    }

    public void makeDeposit(double cashToDeposit){
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit complete. Current balance is: " + getCashInAccount());
    }

}
