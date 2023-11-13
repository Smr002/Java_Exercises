package ex12_2;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {
        String[] months = { "January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October",
                "November", "December" };
        int[] dom = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index:");
        int index = scanner.nextInt();

        try {
            if (index < 1 || index >12) {
                throw new ArrayIndexOutOfBoundsException("Wrong input");
            }

           
            System.out.println(months[index-1] + " " + dom[index-1]);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception: " + ex.getMessage());
        } finally {
            scanner.close(); 
        }
    }
}
