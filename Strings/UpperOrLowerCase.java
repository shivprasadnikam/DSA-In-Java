package Strings;

public class UpperOrLowerCase {

    public static StringBuilder toUpper(String s) {
        StringBuilder res = new StringBuilder();
        char c = Character.toUpperCase(s.charAt(0));
        res.append(c);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && i < s.length() - 1) {
                res.append(s.charAt(i));
                i++;
                res.append(Character.toUpperCase(s.charAt(i)));

            } else {
                res.append(s.charAt(i));
            }
        }
        return res;

    }

    public static void main(String[] args) {

        String s = "hi i am shiv";
        System.out.println(toUpper(s));

    }

}
