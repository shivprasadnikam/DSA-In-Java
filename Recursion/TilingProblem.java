package Recursion;

import java.util.Scanner;

public class TilingProblem {
    public static int tilling(int n) {
        // Base Case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Kaam
        // Vertical call
        int vertical = tilling(n - 1);

        // Horizontal
        int horizontal = tilling(n - 2);

        // Recursive call
        int totalWays = vertical + horizontal;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println("Enter val of n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Total Ways : " + tilling(n));
    }

}
