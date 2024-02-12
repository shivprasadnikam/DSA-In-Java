package BackTracking;

public class FindSubsets {
    public static void printSubsets(String s, String ans, int idx) {

        // Base Case
        if (idx == s.length()) {
            if (ans.length() == 0) {
                System.out.println("null");

            } else {
                System.out.println(ans);
            }
            return;
        }

        // Kaam
        // Yes
        printSubsets(s, ans + s.charAt(idx), idx + 1);
        // No
        printSubsets(s, ans, idx + 1);
    }

    public static void main(String[] args) {
        String s = "abc";
        printSubsets(s, "", 0);
    }

}
