package Recursion;

public class LengthOfString {
    public static void size(int idx, String s) {
        // Base Case
        if (idx == s.length()) {
            System.out.println("Length of string is : " + idx);
            return;
        }

        // Kaam
        size(idx + 1, s);
    }

    public static void main(String[] args) {
        String a = "";
        size(0, a);
    }

}
