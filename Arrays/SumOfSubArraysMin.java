public class SumOfSubArraysMin {

    public static void subArrays(int arr[], int minSum) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    sum = Arrays.sort(arr[k]);
                    System.out.print(sum + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int minSum = 0;
        int arr[] = { 3, 1, 2, 4 };
        subArrays(arr, minSum);

    }

}
