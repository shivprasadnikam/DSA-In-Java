package Recursion;

import java.util.Scanner;

public class PrintNumberInsc {

    public static void printInc(int n) {

        // Base Case
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        // Recursive call
        printInc(n - 1);
        // Kaam
        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        System.out.println("Enter any number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printInc(n);
    }

}
