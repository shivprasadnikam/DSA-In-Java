package Recursion;

public class RemoveDuplicateChar {

    public static String removeDuplicate(String str, int idx, StringBuilder newStr, boolean[] map) {
        if (idx == str.length()) {
            return newStr.toString();
        }

        // Kaam
        char ch = str.charAt(idx);
        if (map[ch - 'a'] == true) {
            removeDuplicate(str, idx + 1, newStr, map);
        } else {
            map[ch - 'a'] = true;
            removeDuplicate(str, idx + 1, newStr.append(ch), map);
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        String s = "aaaaaaaaaaab";
        System.out.println(removeDuplicate(s, 0, new StringBuilder(), new boolean[26]));
    }

}
