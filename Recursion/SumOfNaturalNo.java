package Recursion;

import java.util.Scanner;

public class SumOfNaturalNo {

    public static int printSum(int n) {
        int sum = 0;
        // Base Case
        if (n == 1) {
            return 1;
        }

        // Kaam
        int curr = printSum(n - 1);
        int res = n + printSum(n - 1);
        return res;

        // Recursive call

    }

    public static void main(String[] args) {
        System.out.println("Enter value of n :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printSum(n));

    }

}
