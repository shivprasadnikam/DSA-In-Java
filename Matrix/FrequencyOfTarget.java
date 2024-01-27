package Matrix;

import java.util.Scanner;

public class FrequencyOfTarget {
    public static void freq(int arr[][], int target) {
        // loop over array to maintain count
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == target) {
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("Target element is not present in Array ");
        } else {
            System.out.println("Count of " + target + " is : " + count);
        }

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
        System.out.println("Enter target val :");
        int target = sc.nextInt();
        freq(arr, target);
    }

}
