package BasicSorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class InbulidSort {
    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    // by providing starting and ending index
    public static void startEndIndex(int nums[], int si, int ei) {
        Arrays.sort(nums, si, ei);
    }

    // using collection framework for reversing
    public static void reverseArray(Integer arr[]) {
        Arrays.sort(arr, Collections.reverseOrder());
    }

    public static void main(String[] args) {
        int nums[] = { 5, 3, 4, 2, 1 };
        Integer arr[] = { 6, 7, 9, 8, 10 };
        System.out.println("Before sorting");
        // printArray(nums);
        // Arrays.sort(nums);
        System.out.println("");
        printArray(nums);
        int si = 2;
        int ei = 4;
        System.out.println("Implementing sorting using si: " + si + " and ei: " + "");
        startEndIndex(nums, si, ei);
        printArray(nums);
        reverseArray(arr);

    }

}
