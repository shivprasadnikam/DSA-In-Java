package Recursion;

import java.util.Scanner;

public class XPowerN {

    public static int xPower(int val, int power) {
        // Base
        if (power == 0) {
            return 1;
        }
        // Kaam
        int ans = xPower(val, power - 1);
        int output = val * ans;
        // Recursive call

        return output;
    }

    public static void main(String[] args) {
        System.out.println("Enter any value of x :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter any value of power :");
        int n = sc.nextInt();
        System.out.println(xPower(x, n));

    }

}
