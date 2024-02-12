package ArrayList;

import java.util.ArrayList;

public class MaxElement {
    public static int maxElement(ArrayList<Integer> ans) {
        int max = -1;
        // int curr=ans.get(0);
        for (int i = 0; i < ans.size(); i++) {
            if (ans.get(i) > max) {
                max = ans.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println("MaxElement : " + maxElement(list));
    }

}
