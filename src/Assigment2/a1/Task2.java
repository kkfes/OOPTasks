package Assigment2.a1;

import java.util.Arrays;

public class Task2 {
    public static final String EVEN = "Even";
    public static final String ODD = "Odd";
    public static String[] strings = new String[5];

    public static void main(String[] args) {
        for (int i = 0; i < strings.length; i++) {
            if (i % 2 == 0) {
                strings[i] = EVEN;
            } else {
                strings[i] = ODD;
            }
        }
        System.out.println(Arrays.toString(strings));
    }
}
