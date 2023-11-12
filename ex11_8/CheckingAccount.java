package ex11_8;

import java.time.*;

public class CheckingAccount extends Account {
    private int overdraft;

    public int getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(int overdraft) {
        this.overdraft = overdraft;
    }

    public CheckingAccount(int id, double balance, String Name, LocalDate dateCreated, int overdraft) {
        super(id, balance, Name, dateCreated);
        this.overdraft = overdraft;
    }
    
    
    @Override
    public boolean withdraw(double money) {
        if (money < 0 || money > getBalance() || overdraft > (getBalance() - overdraft)) {

            System.out.println("You can not take money");
            
            return false;
        } else {
            setBalance(getBalance() - money);
            return true;
        }
    }
    

}
