package Arrays;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(1);
        //Adding Elements
        list.add(101);
        list.add(104);
        list.add(1045);
        list.add(65);
        list.add(34);
        list.add(3344);
        System.out.println(list);
        list.set(0, 3434);
        System.out.println(list);
        System.out.println(list.contains(9090909));//false

    }
}
