package ArrayList;

import java.util.ArrayList;

public class SwapElements {
    public static ArrayList<Integer> swap(ArrayList<Integer> ans, int fIndx, int Sindx) {
        int temp = ans.get(fIndx);
        ans.set(fIndx, ans.get(Sindx));
        ans.set(Sindx, temp);
        return ans;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int a = 0;
        int b = 2;
        System.out.println("Before swap : " + list);
        System.out.println("After swap " + swap(list, a, b));
    }

}
