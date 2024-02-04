package Recursion;

public class NumToChar {
    static String[] digits = {
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine"

    };

    public static void numToChar(int n) {
        if (n == 0) {
            return;
        }
        int lastDigit = n % 10;
        numToChar(n / 10);
        System.out.print(digits[lastDigit] + " ");

    }

    public static void main(String[] args) {
        numToChar(101);
    }

}
