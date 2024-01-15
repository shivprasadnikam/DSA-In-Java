package Arrays;

public class TrappedRainWater {
    public static void trappedWater(int arr[]) {
        int[] leftMost = new int[arr.length];
        int[] rightMost = new int[arr.length];
        leftMost[0] = arr[0];
        rightMost[arr.length - 1] = arr[arr.length - 1];
        // LeftMost auxillary array
        for (int i = 1; i < leftMost.length; i++) {
            leftMost[i] = Math.max(arr[i], leftMost[i - 1]);
        }
        // RightMost auxilary array
        for (int i = rightMost.length - 2; i >= 0; i--) {
            rightMost[i] = Math.max(arr[i], rightMost[i + 1]);
        }
        int trappedWater = 0;
        for (int i = 0; i < arr.length; i++) {
            trappedWater += (Math.min(leftMost[i], rightMost[i]) - arr[i]) * 1;
        }
        System.out.println("Total Trapped water is : " + trappedWater);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 3, 2, 5 };
        trappedWater(arr);
    }

}
