package Recursion;

import java.util.Scanner;

public class FriendsPairingPrb {
    public static int res(int n) {
        // Base Case
        if (n == 1 || n == 2) {
            return n;
        }

        // Kaam
        // Single
        int fnm1 = res(n - 1);
        // Combine
        int fnm2 = res(n - 2);
        int pairsWays = fnm2 * (n - 1);

        // Call
        int totalWays = fnm1 + pairsWays;
        return totalWays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int friends = sc.nextInt();
        System.out.println("Total No of ways for " + friends + " friends :" + res(friends));
    }

}
