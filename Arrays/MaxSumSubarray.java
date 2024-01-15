package Arrays;

public class MaxSumSubarray {

    public static void maxSumArray(int arr[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println("Maximum Sum Subarray is : " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        maxSumArray(arr);
    }

}
