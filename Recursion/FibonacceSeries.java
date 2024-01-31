package Recursion;

import java.util.Scanner;

public class FibonacceSeries {

    public static int printFibo(int n) {

        // Base case
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // Kaam
        int fn1 = printFibo(n - 1);
        int fn2 = printFibo(n - 2);

        // Recursive call

        return fn1 + fn2;

    }

    public static void main(String[] args) {

        System.out.println("Enter any value :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fibonacci Val : " + printFibo(n));

    }

}
