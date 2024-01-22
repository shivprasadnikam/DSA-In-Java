package Matrix;

import java.util.Scanner;

public class SearchElementInMatrix {

    public static boolean targetElement(int nums[][], int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] == target) {
                    return true;

                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // 2D Array declaration
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of 2D Array");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter target element :");
        int target = sc.nextInt();
        System.out.println(targetElement(matrix, target));
    }
}
