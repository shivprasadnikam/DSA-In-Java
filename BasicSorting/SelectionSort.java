package BasicSorting;

public class SelectionSort {

    public static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 1, 4 };
        System.out.println("Before sorting -> ");
        selectionSort(arr);
        System.out.println("After sorting -> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
