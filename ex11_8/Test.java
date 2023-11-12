package ex11_8;

import java.util.Scanner;
import java.time.*;

public class Test {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CheckingAccount[] account = new CheckingAccount[10];
        SavingsAccount[] accounts = new SavingsAccount[10];
        account [0] = new CheckingAccount(2, 200, "Kristi", LocalDate.now(), 100); 
        accounts[0] = new SavingsAccount(4,200,"Joel", LocalDate.now() );
        int id;
        double money;

        System.out.println("Welcome to Your Bank!");
        System.out.println("Do you have an account? Enter 1.");
        System.out.println("If you have already an account, Enter 2.");
        int acc = scanner.nextInt();
        int i;
        int index =0;

        switch (acc) {
            case 1:
                System.out.println("Which Account prefer you to open:");
                System.out.println("1.Checking Account or 2.Saving Account");
                int Accountt = scanner.nextInt();
                switch(Accountt){
                    case 1:
                    System.out.println("Enter your name:");
                    scanner.nextLine(); 
                    String name = scanner.nextLine();
                    System.out.println("Enter your balance:");
                    double balance = scanner.nextDouble();
                    LocalDate currentDate = LocalDate.now();
                    id = scanner.nextInt();
                    
               
                    for ( i = 0; i < account.length; i++) {
                        if (account[i] == null) {
                            index = i;
                            break;
                        }
                    }

                    
                    if (index == -1) {
                        System.out.println("Sorry, no available slots for a new account.");
                        return;
                    }

                    account[index] = new CheckingAccount(id, balance, name, currentDate, 100);
                    System.out.println("Account created successfully!");
                    break;
                    case 2:
                    System.out.println("Enter your name:");
                    scanner.nextLine(); 
                    String name1 = scanner.nextLine();
                    System.out.println("Enter your balance:");
                    double balance1 = scanner.nextDouble();
                    LocalDate currentDate1 = LocalDate.now();
                    System.out.println("Enter your id:");
                    id = scanner.nextInt();
                    
               
                    for ( i = 0; i < account.length; i++) {
                        if (account[i] == null) {
                            index = i;
                            break;
                        }
                    }

                    
                    if (index == -1) {
                        System.out.println("Sorry, no available slots for a new account.");
                        return;
                    }

                    accounts[index] = new SavingsAccount(id, balance1, name1, currentDate1);
                    System.out.println("Account created successfully!");
                    break;
                }
                
                case 2:
       
                System.out.println("Please enter your ID (0-9):");
                id = scanner.nextInt();

                for(i=0;i< account.length ; i++){
                    if(id == account[i].getId() || id == accounts[i].getId());
                    

                else{
               
                    System.out.println("Invalid ID. Exiting...");
                    return;
                }

                System.out.println("Hello, " + account[i].getName() + "! You have access to your account in date "
                        + LocalDate.now() + " and time is: " + LocalTime.now());
                System.out.println("Which account do you have?");
                System.out.println("1. Savings Account");
                System.out.println("2. Checking Account");
                int choose = scanner.nextInt();

                switch (choose) {
                    case 1:
                        while (true) {
                            System.out.println("\n===== Menu =====");
                            System.out.println("1. Check Your Balance");
                            System.out.println("3. Deposit Money");
                            System.out.println("4. Exit");
                            System.out.print("Enter your choice (1-4): ");
                            int choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    System.out.println("Your balance is: $" + accounts[i].getBalance());
                                    break;
                                case 3:
                                    System.out.print("Enter the amount to deposit: $");
                                    money = scanner.nextDouble();
                                    account[i].deposit(money);
                                    System.out.println(
                                            "Deposit successful. Your balance is now: $" + accounts[i].getBalance());
                                    break;
                                case 4:
                                    System.out.println("Goodbye, " + accounts[i].getName() + "!");
                                    return;
                                default:
                                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                                    break;
                            }
                        }

                    case 2:
                        while (true) {
                            System.out.println("\n===== Menu =====");
                            System.out.println("1. Check Your Balance");
                            System.out.println("2. Withdraw Money");
                            System.out.println("3. Deposit Money");
                            System.out.println("4. Exit");
                            System.out.print("Enter your choice (1-4): ");
                            int choice = scanner.nextInt();

                            switch (choice) {
                                case 1:
                                    System.out.println("Your balance is: $" + account[i].getBalance());
                                    break;
                                case 2:
                                    System.out.print("Enter the amount to withdraw: $");
                                    money = scanner.nextDouble();
                                    account[i].withdraw(money);
                                    System.out.println(
                                            "Withdrawal successful. Your balance is now: $" + account[i].getBalance());
                                    break;
                                case 3:
                                    System.out.print("Enter the amount to deposit: $");
                                    money = scanner.nextDouble();
                                    account[i].deposit(money);
                                    System.out.println(
                                            "Deposit successful. Your balance is now: $" + account[i].getBalance());
                                    break;
                                case 4:
                                    System.out.println("Goodbye, " + account[i].getName() + "!");
                                    return;
                                default:
                                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                                    break;
                            }
                        }

                    default:
                        System.out.println("Invalid choice. Please enter 1 or 2.");
                        break;
                }
                break;
        }

    }
}
}
