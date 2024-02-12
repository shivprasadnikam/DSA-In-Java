package ArrayList;

import java.util.*;

public class ReverseArrayList {
    public static void reverList(ArrayList<Integer> ans) {
        System.out.println("Reversed ArrayList");
        for (int i = ans.size() - 1; i >= 0; i--) {
            System.out.print(ans.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println("Orginal List " + list);
        reverList(list);

    }

}
