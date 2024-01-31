package Recursion;

public class LastOccurance {
    public static int lastOcc(int arr[], int target, int idx) {
        // Base
        if (idx == 0) {
            return -1;
        }

        // Kaam
        if (arr[idx] == target) {
            return idx;
        }

        // Recusive call
        return lastOcc(arr, target, idx - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 3, 4 };
        System.out.println(lastOcc(arr, 3, arr.length - 1));
    }
}
