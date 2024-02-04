package DivideAndConquer;

public class QuickSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int arr[], int si, int ei) {
        // Base case
        if (si >= ei) {
            return;
        }
        int pIdx = partition(arr, si, ei);

        quickSort(arr, si, pIdx - 1); // before
        quickSort(arr, pIdx + 1, ei); // After

    }

    public static int partition(int arr[], int si, int ei) {
        int piviot = arr[ei];
        int i = si - 1; // to make place element smaller than pivot
        for (int j = si; j < ei; j++) {
            if (arr[j] <= piviot) {
                // swap them
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }

        }
        i++;
        int temp = piviot;
        arr[ei] = arr[i]; // piviot = arr[i]
        arr[i] = temp;
        return i;

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 1, 2, 3 };
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

}
