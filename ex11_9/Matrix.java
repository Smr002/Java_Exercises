package ex11_9;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns: ");
        int n = scanner.nextInt();

        int[][] matrix = generateRandomMatrix(n);

        System.out.println("Generated Matrix:");
        printMatrix(matrix);

        ArrayList<Integer> maxRowIndices = findMaxRows(matrix);
        ArrayList<Integer> maxColIndices = findMaxColumns(matrix);

        System.out.println("\nRows with the most 1s: " + maxRowIndices);
        System.out.println("Columns with the most 1s: " + maxColIndices);
    }

    
    private static int[][] generateRandomMatrix(int n) {
        int[][] matrix = new int[n][n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(2); 
            }
        }

        return matrix;
    }

   
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

  
    private static ArrayList<Integer> findMaxRows(int[][] matrix) {
        int maxCount = 0;
        ArrayList<Integer> maxRowIndices = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxRowIndices.clear();
                maxRowIndices.add(i);
            } else if (count == maxCount) {
                maxRowIndices.add(i);
            }
        }

        return maxRowIndices;
    }

    
    private static ArrayList<Integer> findMaxColumns(int[][] matrix) {
        int maxCount = 0;
        ArrayList<Integer> maxColIndices = new ArrayList<>();

        for (int j = 0; j < matrix[0].length; j++) {
            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxColIndices.clear();
                maxColIndices.add(j);
            } else if (count == maxCount) {
                maxColIndices.add(j);
            }
        }

        return maxColIndices;
    }
}
