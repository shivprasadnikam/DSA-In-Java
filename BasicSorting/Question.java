package BasicSorting;

public class Question {
    public static void print(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
    }

    public static void bubbleSort(int nums[]) {
        System.out.println("Implementing bubble sort for sorting array in descending order :\n");

        // swap adjancent element
        int turns = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            turns++;
            for (int j = i + 1; j < nums.length - 1 - i; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];

                }
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        bubbleSort(nums);
        print(nums);
    }

}
