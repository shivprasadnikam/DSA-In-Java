package Recursion;

import java.util.Scanner;

public class Factorial {

    public static int printFact(int n) {
        // Base Case
        if (n == 0) {
            n *= 1;
            return n;
        }

        // Kaam

        // Recursive call
        return n * printFact(n - 1);

    }

    public static void main(String[] args) {
        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printFact(n));
    }

}
