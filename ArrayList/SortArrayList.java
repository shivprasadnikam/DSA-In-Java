package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println("Normal : " + list);
        Collections.sort(list);
        System.out.println("Ascending order : " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order " + list);

    }

}
