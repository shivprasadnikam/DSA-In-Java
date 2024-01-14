package Arrays;

public class PairsInArray {
    public static void pairs(int arr[]) {
        int totalPairs = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int current = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + current + "," + arr[j] + ")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Number of pairs are : " + totalPairs);

    }

    public static void main(String[] args) {
        System.out.println("Learning Pairs in array ");
        int arr[] = { 2, 4, 6, 8, 10 };
        pairs(arr);
    }

}
