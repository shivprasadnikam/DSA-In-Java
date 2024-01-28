package Strings;

public class LargestString {
    public static String largest(String[] f) {
        String largest = f[0];
        for (int i = 1; i < f.length; i++) {
            if (largest.compareTo(f[i]) < 0) {
                largest = f[i];

            }
        }
        return largest;
    }

    public static void main(String[] args) {
        String[] fruits = { "apple", "banana", "carrot" };
        System.out.println(largest(fruits));
    }

}
