package Strings;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean palindrome(String check) {
        int i = 0;
        int j = (check.length() - 1) / 2;
        System.out.println(j);
        while (i <= j) {
            if (check.charAt(i) != check.charAt(j)) {
                return false;
            }
            i++;
            j--;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter a String :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (palindrome(str)) {
            System.out.println("Given string is palindrome");
        } else {
            System.out.println("Given string is not palindrome");
        }

    }

}
