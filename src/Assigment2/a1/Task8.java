package Assigment2.a1;

public class Task8 {
    public static void main(String[] args) {
        int[][] MULTIPLICATION_TABLE = new int[10][10];

        // Fill the array with the multiplication table
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                MULTIPLICATION_TABLE[i][j] = (i + 1) * (j + 1);
            }
        }

        // Output the multiplication table to the console
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println();
        }
    }
}