package Arrays;

import java.util.Scanner;

public class BasicsOfArrays {

    public static void main(String[] args) {
        System.out.println("Creating integer Array of size 5");
        int arr[] = new int[5];

        System.out.println("Inserting elements into Array");
        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
        System.out.println("Printing elements of Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " is " + arr[i]);
        }
    }
}
