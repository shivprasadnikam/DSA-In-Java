package Recursion;

// Find occurance of given element using recursion
public class EveryOccuranceOfK {

    public static void occurance(int[] arr, int idx, int key) {

        // Base case
        if (idx == arr.length - 1) {
            return;
        }

        // Kaam
        if (arr[idx] == key) {
            System.out.println(idx);
        }
        occurance(arr, idx + 1, key);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 2, 3, 4 };
        occurance(arr, 0, 2);
    }

}
