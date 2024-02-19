package T19ArrayList;

import java.util.ArrayList;

public class L6MultiDimensionArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(4);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(9);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(5);
        list3.add(25);
        list3.add(50);

        list.add(list1);
        list.add(list2);
        list.add(list3);
        System.out.println(list);

    }
}
