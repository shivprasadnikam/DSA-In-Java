package BackTracking;

public class BackTrackArray {
    public static void backTrack(int[] arr, int idx, int val) {
        // Base case

        if (idx == arr.length) {
            print(arr);
            return;
        }

        // Kaam
        arr[idx] = val;
        backTrack(arr, idx + 1, val + 1);
        arr[idx] -= 2;

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        backTrack(arr, 0, 1);
        print(arr);
    }

}
