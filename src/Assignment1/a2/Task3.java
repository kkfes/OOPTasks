package Assignment1.a2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int temp = in.nextInt();

        boolean isHigh;
        boolean isLow;

        isHigh = temp > 37.5;
        isLow = temp < 36.0;

        if (isHigh) {
            System.out.println("Your body temperature is high.");
        } else if (isLow) {
            System.out.println("Your body temperature is low.");
        } else {
            System.out.println("Your body temperature is normal.");
        }
    }
}
