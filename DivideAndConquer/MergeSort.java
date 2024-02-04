package DivideAndConquer;

public class MergeSort {

    public static void mergeSort(int arr[], int si, int ei) {

        // Base case
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        // divide left part
        mergeSort(arr, si, mid);
        // System.out.println("Inside Merge sort ");
        // divide right part
        mergeSort(arr, mid + 1, ei);

        // Kaam
        merge(arr, si, mid, ei);

    }

    public static void merge(int arr[], int si, int mid, int ei) {

        // create temp array
        int temp[] = new int[ei - si + 1];
        int i = si; // traversing left part
        int j = mid + 1; // traversing right part
        int k = 0; // traversing temp array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;

            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // for left over left side part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // for left over right side part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // System.out.println("Inside Merge :");
        // Copy temp array to original one
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 3 };
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

}
