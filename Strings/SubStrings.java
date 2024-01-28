package Strings;

import java.util.Scanner;

public class SubStrings {
    public static String subStrings(String s, int idx1, int idx2) {
        String result = new String();
        for (int i = idx1; i < idx2; i++) {
            result += s.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Enter Starting index : ");
        int start = sc.nextInt();
        System.out.println("Enter Ending index : ");
        int end = sc.nextInt();
        System.out.println(subStrings(s, start, end));

    }

}
