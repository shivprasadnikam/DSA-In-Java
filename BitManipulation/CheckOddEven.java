package BitManipulation;

import java.util.Scanner;

public class CheckOddEven {
    public static void oddOrEven(int n) {

        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println(n + " is even ");
        } else {
            System.out.println(n + " is odd ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter any number ");
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        oddOrEven(nums);
    }

}
