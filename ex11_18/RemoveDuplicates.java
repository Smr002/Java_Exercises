package ex11_18;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void removeDuplicates(ArrayList<Integer> numbers) {
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);

           
            if (!uniqueNumbers.contains(currentNumber)) {
                uniqueNumbers.add(currentNumber);
            }
        }

        numbers.clear();
        numbers.addAll(uniqueNumbers);
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter 10 numbers:");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        removeDuplicates(numbers);
    }
}
