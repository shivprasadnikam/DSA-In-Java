
import java.util.Scanner;

public class LargestElement {
    public static int largest(int arr[]) {
        int currentMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (currentMax <= arr[i]) {
                currentMax = arr[i];
            }
        }
        return currentMax;
    }

    public static void main(String[] args) {
        System.out.println("Find largest element in array :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Insert element in array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int largestElement = largest(arr);
        System.out.println("Largest Element is " + largestElement);

    }

}
