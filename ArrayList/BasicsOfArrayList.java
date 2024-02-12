package ArrayList;

import java.util.*;

public class BasicsOfArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Add element
        list.add(3);
        list.add(4);
        // Print List
        System.out.println(list);

        // Get Operation
        int n = list.get(0);
        System.out.println(n);

        // Remove Element
        // list.remove(0);
        System.out.println(list);

        // Set Element
        list.set(1, 2);
        list.set(0, 5);
        System.out.println(list);

        // list.contains
        System.out.println(list.contains(5));
        System.out.println(list.contains(1));
        System.out.println("Size " + list.size());
    }

}
