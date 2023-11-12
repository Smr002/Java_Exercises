package ex11_8;
import java.time.*;
import java.util.ArrayList;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private LocalDate dateCreated;
    private String Name;
   
 
    public Account(){}

    public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Account(int id, double balance, String Name, LocalDate dateCreated) {
        this.id = id;
        this.balance = balance;
        this.Name = Name;
        this.dateCreated = LocalDate.now(); 
    }

    

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyIntrest() {
        return balance * (annualInterestRate/12);
    }

    public double getMonthlyInterest() {
        return this.balance * (this.annualInterestRate / 12);
    }
    
    public  boolean  withdraw(double money) {
        if (money < 0 || money > balance) {
            return false;
        } else {
            balance -= money;
            return true ;
        }
    }

    public double deposit(double money) {
        if (money < 0) {
                return+ -1;
        } else {
            balance += money;
            return  balance;

        }
    }

}
