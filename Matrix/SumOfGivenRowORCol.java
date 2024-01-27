package Matrix;

import java.util.Scanner;

public class SumOfGivenRowORCol {
    public static void sum(int[][] arr, int val) {
        int sum = 0;
        for (int col = 0; col < arr.length; col++) {
            sum += arr[val][col];
        }
        System.out.println("Sum of val " + val + "is : " + sum);
    }

    public static void main(String[] args) {
        // create array
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of array :");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        System.out.println("Enter val of row/col :");
        int row = sc.nextInt();
        sum(arr, row);

    }

}
