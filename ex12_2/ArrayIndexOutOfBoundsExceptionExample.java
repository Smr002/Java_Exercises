package ex12_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {
        String[] months = { "January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October",
                "November", "December" };
        int[] dom = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the index (1-12, 0 to exit): ");

            try {
                if (!scanner.hasNextInt()) {
                    throw new InputMismatchException("Wrong input");
                }

                int index = scanner.nextInt();

                if (index == 0) {
                    System.out.println("Exiting program.");
                    break;
                }

                if (index < 1 || index > 12) {
                    throw new ArrayIndexOutOfBoundsException("Wrong input");
                }

                System.out.println(months[index - 1] + " " + dom[index - 1]);

            } catch (InputMismatchException ex) {
                System.out.println("Exception: " + ex.getMessage());
                scanner.nextLine(); 
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Exception: " + ex.getMessage());
            }
        }

        scanner.close(); 
}
}
