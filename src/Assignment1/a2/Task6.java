package Assignment1.a2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true){
            String data = in.next();
            if(data.equals("ENTER")){
                break;
            }
            sum += Integer.parseInt(data);
        }
        System.out.println(sum);
    }
}
