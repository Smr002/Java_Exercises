package ex11_4;
import java.util.Scanner;
import java.time.*;

public class Test {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CheckingAccount account = new CheckingAccount(2, 200, "Kristi", LocalDate.now(), 100);
        int id;
        double money;

        System.out.println("Welcome to Your Bank!");
        System.out.println("Please enter your ID (0-9):");
        id = scanner.nextInt();

        if (id < 0 || id > 9) {
            System.out.println("Invalid ID. Exiting...");
            return;
        }

        System.out.println("Hello, " + account.getName() + "! You have access to your account in date "
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
                            System.out.println("Your balance is: $" + account.getBalance());
                            break;
                        case 3:
                            System.out.print("Enter the amount to deposit: $");
                            money = scanner.nextDouble();
                            account.deposit(money);
                            System.out.println("Deposit successful. Your balance is now: $" + account.getBalance());
                            break;
                        case 4:
                            System.out.println("Goodbye, " + account.getName() + "!");
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
                            System.out.println("Your balance is: $" + account.getBalance());
                            break;
                        case 2:
                            System.out.print("Enter the amount to withdraw: $");
                            money = scanner.nextDouble();
                            account.withdraw(money);
                            System.out.println("Withdrawal successful. Your balance is now: $" + account.getBalance());
                            break;
                        case 3:
                            System.out.print("Enter the amount to deposit: $");
                            money = scanner.nextDouble();
                            account.deposit(money);
                            System.out.println("Deposit successful. Your balance is now: $" + account.getBalance());
                            break;
                        case 4:
                            System.out.println("Goodbye, " + account.getName() + "!");
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
    }
}
