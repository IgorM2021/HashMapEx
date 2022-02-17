import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;

     public class Fibonacci {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Write the order of fibonacci you want:");
        int number = Integer.parseInt(scan.nextLine());
        ArrayList<Long> fibonacci = new ArrayList<Long>();

        fibonacci.add(1L);
        fibonacci.add(1L);
        for (int i = 2; i < number;i++) {
            fibonacci.add( fibonacci.get(i - 1) + fibonacci.get(i - 2));
        }

        System.out.print("This corresponds to: ");
        System.out.println(fibonacci.get(number - 1));
ghjklövu
        hgj
    jhg}
}
