package Assignment1.a2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Task 1
        int temp = in.nextInt();
        System.out.println(temp<0?"it’s cold outside":"it’s warm outside");

        // Task 2

        String name = in.next();
        int age = in.nextInt();
        if(age>=18&&age<=28)
            System.out.println(name+", come to the military registration and enlistment office");

        // Task 3

        temp = in.nextInt();

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

        // Task 4

        age = in.nextInt();
        if(age<20||age>60)
            System.out.println("You don't have to work");

        // Task 5
        int i = 0;
        while (i<100){
            i++;
            System.out.println("I will never work for pennies");
        }

        // Task 6
        int sum = 0;
        while (true){
            String data = in.next();
            if(data.equals("ENTER")){
                break;
            }
            sum += Integer.parseInt(data);
        }
        System.out.println(sum);

        // Task 7

        i = 0;
        int j = 0;
        while (i<5){
            while (j<10){
                System.out.print("Q");
                j++;
            }
            System.out.println();
            j=0;
            i++;
        }

        // Task 8

        i = 1;
        sum = 0;
        while (i<=100){
            if(i%3!=0){
                sum+=i;
            }
            i++;
        }
        System.out.println(sum);

        // Task 9

        for (int k = 1; k <= 15; k++) {
            if(k%2==0)
                System.out.println(k);
        }

        // Task 10

        int start = in.nextInt();
        int end = in.nextInt();
        int multiple = in.nextInt();
        sum = 0;
        for (int k = start; k < end; k++) {
            if(k%multiple==0)
                sum+=k;
        }

        System.out.println(sum);

        // Task 11

        for (int k = 0; k < 10; k++) {
            for (int l = 0; l < k + 1; l++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
