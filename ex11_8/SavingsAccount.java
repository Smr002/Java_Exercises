package ex11_8;

import java.time.*;

public class SavingsAccount extends Account {

    public SavingsAccount(int id, double balance, String name, LocalDate dateCreated) {
        super(id, balance, name, dateCreated);
    }


    @Override
    public double deposit(double money) {
        if (money < 0) {
            return+ -1;
        } else {
            setBalance(getBalance() + money);
            return getBalance(); 
        }
    }
    



   
}
