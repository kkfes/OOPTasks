package Assigment2.a1;

public class Task12 {
    public static int[][] array = new int[2][3];

    public static void main(String[] args) {
        // Fill the array with integers (except 0)
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = value++;
            }
        }

        // Output the elements of the array, each element on a new line
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}