package BasicSorting;

public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        int turns = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    turns++;
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }

        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 1, 4 };
        System.out.println("Before sorting -> ");
        bubbleSort(arr);
        System.out.println("After sorting -> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
