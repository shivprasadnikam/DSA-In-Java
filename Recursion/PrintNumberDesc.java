package Recursion;

import java.util.Scanner;

public class PrintNumberDesc {

    public static void printDesc(int n) {
        // Base Case
        if (n == 1) {
            System.out.println(n + " ");
            return;
        }
        // Kaam
        System.out.print(n + " ");
        // repeat
        printDesc(n - 1);

    }

    public static void main(String[] args) {
        System.out.println("Enter any number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDesc(n);
    }

}
