package Recursion;

import java.util.Scanner;

public class Factorial {

    public static int printFact(int n) {
        // Base Case
        if (n == 0) {
            return 1;
        }

        // Kaam
        int prev = printFact(n - 1);
        int val = n * prev;

        // Recursive call
        return val;

    }

    public static void main(String[] args) {
        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printFact(n));
    }

}
