package ex12_5;

import java.util.Scanner;

public class IllegalArgumentExceptionExample 
 {
    public static void main(String[]args) throws IllegalArgumentException{
     Scanner scanner = new Scanner(System.in);
    

        try {
            System.out.println("Enter the three sides of the triangle:");
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            double side3 = scanner.nextDouble();

            
            Triangle triangle = new Triangle(side1, side2, side3);
            

            
            System.out.println("Triangle is valid. You can proceed with other operations.");
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
           
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid numerical values for the sides.");
            
        } finally {
            scanner.close();
        }

    }
}
