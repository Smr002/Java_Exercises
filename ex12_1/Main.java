package ex12_1;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0; 
        char operator;
        int firstNumber=0;
        int secondNumber=0;

        try {
            System.out.print("Enter the first number: ");
            if (!scanner.hasNextInt()) {
                throw new ArithmeticException("Invalid input. Please enter a valid integer for the first number.");
            }
            firstNumber = scanner.nextInt();

            System.out.print("Enter an operator (+ or -): ");
            operator = scanner.next().charAt(0);

            System.out.print("Enter the second number: ");
            if (!scanner.hasNextInt()) {
                throw new ArithmeticException("Invalid input. Please enter a valid integer for the second number.");
            }
            secondNumber= scanner.nextInt();

           
            if (operator == '+') {
                result = firstNumber + secondNumber;
            } else if (operator == '-') {
                result = firstNumber - secondNumber;
            }else{
                 throw new ArithmeticException("Invalid operator. Only + or - allowed.");
            }
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
