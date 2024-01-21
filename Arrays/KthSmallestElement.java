import java.util.Arrays;

public class KthSmallestElement {

    public static void kthSmallest(int nums[], int k) {
        Arrays.sort(nums);
        if (k < nums.length) {
            System.out.println(k + "th smallest element is : " + nums[k]);
        } else {
            System.out.println("Enter valid index ");
        }

    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 5, 6, 7 };
        kthSmallest(nums, 5);

    }

}
