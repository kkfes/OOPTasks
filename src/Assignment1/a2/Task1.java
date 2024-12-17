package Assignment1.a2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        System.out.println(temp<0?"it’s cold outside":"it’s warm outside");
    }
}
