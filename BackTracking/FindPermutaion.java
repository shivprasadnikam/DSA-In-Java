package BackTracking;

public class FindPermutaion {
    public static void permute(String str, String ans) {
        // Base Case
        if (str.length() == 0) {
            // System.out.println(ans);
            return;
        }
        // Kaam
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            // abcde
            String newStr = str.substring(0, i) + str.substring(i + 1);
            System.out.println(i + " th " + newStr);
            permute(newStr, ans + ch);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permute(str, "");
    }

}
