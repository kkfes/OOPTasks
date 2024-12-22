package Assigment2.a1;

public class Task11 {
    public static int[][][][] multiArray;

    public static void main(String[] args) {
        multiArray = new int[2][2][2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 2; l++) {
                        multiArray[i][j][k][l] = i + j + k + l;
                    }
                }
            }
        }

        for (int[][][] array3D : multiArray) {
            for (int[][] array2D : array3D) {
                for (int[] array1D : array2D) {
                    for (int num : array1D) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}