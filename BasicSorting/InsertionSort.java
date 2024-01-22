package BasicSorting;

public class InsertionSort {

    public static void insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int curr = i;
            int prev = i - 1;
            // finding out correct position
            while (prev >= 0 && arr[prev] > arr[curr]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion of element
            arr[prev + 1] = arr[curr];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 1, 4 };
        System.out.println("Before sorting -> ");
        insertionSort(arr);
        System.out.println("After sorting -> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
