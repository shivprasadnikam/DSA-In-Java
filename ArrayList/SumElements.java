package ArrayList;

import java.util.ArrayList;

public class SumElements {
    public static void sum(ArrayList<Integer> ans, int target) {
        for (int i = 0; i < ans.size() - 1; i++) {
            for (int j = i + 1; j < ans.size(); j++) {
                if (ans.get(i) + ans.get(j) == target) {
                    System.out.println(ans.get(i) + " " + ans.get(j));
                }
            }
        }
    }

    public static void main(String[] args) {
        int target = 5;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        sum(list, target);
    }

}
