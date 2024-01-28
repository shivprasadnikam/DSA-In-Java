package Matrix;

import java.util.Scanner;

public class Transpose {

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transposeMatrix(int[][] arr) {

        // Transpose means interchange rows with columns visa versa
        int row = arr[0].length;
        int col = arr.length;
        System.out.println("No of rows before transpose " + arr.length + " and col " + arr[0].length);
        int res[][] = new int[row][col];
        // System.out.println(arr[0][2]);
        System.out.println("Matrix after transpose");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[i][j] = arr[j][i];
            }

        }
        printMatrix(res);
        System.out.println("No of rows before transpose " + row + " and col " + col);
    }

    public static void main(String[] args) {
        // create array
        int[][] arr = new int[4][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of array :");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        System.out.println("Matrix before transpose");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        transposeMatrix(arr);
    }

}
