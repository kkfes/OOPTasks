package Assigment2.a1;

import java.util.Scanner;

public class Task16 {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = 2 * height - 1;
        array = new char[height][width];

        // Fill the array with spaces
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                array[i][j] = ' ';
            }
        }

        // Fill the array to form a pyramid
        for (int i = 0; i < height; i++) {
            int start = height - 1 - i;
            int end = height - 1 + i;
            for (int j = start; j <= end; j++) {
                array[i][j] = '#';
            }
        }

        // Display the array
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}