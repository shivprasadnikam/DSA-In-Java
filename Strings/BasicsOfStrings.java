package Strings;

public class BasicsOfStrings {
    public static void main(String[] args) {
        char[] charArr = { 'a', 'b', 'c' };
        String str1 = "abc";
        String str2 = "def";
        System.out.println("Length of String " + str1.length());
        String conctString = str1 + str2;
        System.out.println("Length of conctString " + conctString.length());
        System.out.println("Char at 1st index : " + conctString.charAt(1));

    }

}
