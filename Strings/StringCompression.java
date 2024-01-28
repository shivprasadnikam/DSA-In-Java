package Strings;

public class StringCompression {
    public static StringBuilder cmp(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            Integer count = 1;
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            res.append(s.charAt(i));
            if (count > 1) {
                res.append(count);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(cmp(s));

    }

}
