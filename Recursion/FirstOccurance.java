package Recursion;

public class FirstOccurance {
    public static int firstOcc(int arr[], int target, int idx) {
        // base
        if (idx == arr.length - 1) {
            return -1;
        }

        if (arr[idx] == target) {
            return idx;
        }
        return firstOcc(arr, target, idx + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 3, 4 };
        System.out.println(firstOcc(arr, 3, 0));
    }

}
