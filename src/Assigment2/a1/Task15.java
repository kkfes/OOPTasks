package Assigment2.a1;

import java.util.Scanner;

public class Task15 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Fill the array with numbers from the keyboard
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // Flip the array with respect to the main diagonal
        int[][] flippedArray = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                flippedArray[i][j] = array[j][i];
            }
        }

        // Display the inverted array
        for (int i = 0; i < flippedArray.length; i++) {
            for (int j = 0; j < flippedArray[i].length; j++) {
                System.out.print(flippedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}