package Assignment1.a2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        int multiple = in.nextInt();
        int sum = 0;
        for (int k = start; k < end; k++) {
            if(k%multiple==0)
                sum+=k;
        }

        System.out.println(sum);
    }
}
