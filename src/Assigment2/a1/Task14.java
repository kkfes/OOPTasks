package Assigment2.a1;

import java.util.Scanner;

public class Task14 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Fill the array with numbers from the keyboard
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // Calculate the sum of elements in each row and each column
        int[] rowSums = new int[3];
        int[] colSums = new int[3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                rowSums[i] += array[i][j];
                colSums[j] += array[i][j];
            }
        }

        // Find the minimum sum among row sums and column sums
        int minSum = rowSums[0];
        for (int i = 1; i < rowSums.length; i++) {
            if (rowSums[i] < minSum) {
                minSum = rowSums[i];
            }
        }
        for (int j = 0; j < colSums.length; j++) {
            if (colSums[j] < minSum) {
                minSum = colSums[j];
            }
        }

        // Display the minimum sum
        System.out.println(minSum);
    }
}