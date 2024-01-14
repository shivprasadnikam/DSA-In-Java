package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;
        // must needed

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Learning binary search :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Insert element in array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr);
        System.out.println("Enter Target element :");
        int target = sc.nextInt();
        System.out.println("Element present at " + binarySearch(arr, target));
    }

}
