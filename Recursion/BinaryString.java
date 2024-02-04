package Recursion;

// Print all binary string of size n without consecutive ones
public class BinaryString {

    public static void binaryString(int n, int lastPlace, String newStr) {
        // Base Case
        if (n == 0) {
            System.out.println(newStr);
            return;
        }

        // Kaam
        binaryString(n - 1, 0, newStr + "0");
        if (lastPlace == 0) {
            binaryString(n - 1, 1, newStr + "1");
        }
    }

    public static void main(String[] args) {
        binaryString(3, 0, "");

    }

}
