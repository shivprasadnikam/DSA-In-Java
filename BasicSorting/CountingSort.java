package BasicSorting;

public class CountingSort {
    public static void print(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static void countSort(int nums[]) {
        // find largest element
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largest = Integer.max(largest, nums[i]);
        }
        System.out.println("Largest Element is : " + largest);
        // maintain count
        int count[] = new int[largest + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        // sort
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1, 4, 5, 2, 5 };
        countSort(nums);
        print(nums);
    }

}
