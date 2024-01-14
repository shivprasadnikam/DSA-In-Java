package Arrays;

import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            // System.out.println("Searching for index of " + target + " and current element
            // is: " + arr[i]);
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println("Find index of target element");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Insert element in array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter Target element :");
        int target = sc.nextInt();
        int index = linearSearch(arr, target);
        if (index == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println("Target element is present at index " + index);
        }

    }

}
