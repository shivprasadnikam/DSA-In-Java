package Strings;

public class CompareString {
    public static boolean strictCompare(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        return false;

    }

    public static boolean compare(String s1, String s2) {
        if (s1 == s2) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        System.out.println(compare(str1, str2));
        System.out.println(compare(str1, str3));
        System.out.println(strictCompare(str1, str3));

    }

}
