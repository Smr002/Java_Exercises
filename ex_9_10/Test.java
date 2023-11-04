package ex_9_10;

import java.util.Scanner;

public class Test {
    public static void main(String [] args){

        System.out.println("Please 3 int a b c for your equation:");
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        b= scanner.nextInt();      
        c=scanner.nextInt();

        QuadraticEquation QuadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println(QuadraticEquation.getDiscriminat());


        

    }
}
