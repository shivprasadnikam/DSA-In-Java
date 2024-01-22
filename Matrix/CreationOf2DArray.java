package Matrix;

import java.util.Scanner;

public class CreationOf2DArray {

    public static void print2DArray(int nums[][]) {
        System.out.println("Printing 2D Array :");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.println("Value : [" + i + "]" + "[" + j + "] " + nums[i][j]);
            }
        }
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
        print2DArray(matrix);
    }

}
