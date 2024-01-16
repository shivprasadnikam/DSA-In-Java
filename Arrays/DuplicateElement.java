package Arrays;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElement {
    public static boolean duplicate(int arr[]) {
        // Create hashmap
        Map<Integer, Integer> maps = new HashMap<>();

        // mainting frequency
        for (int element : arr) {
            maps.put(element, maps.getOrDefault(element, 0) + 1);
        }
        // check duplicate element
        for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
            if (entry.getValue() > 1) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1 };
        boolean res = duplicate(arr);
        System.out.println("Duplicate Flag -> " + res);

    }

}
