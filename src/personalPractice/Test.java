package src.personalPractice;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(100);
        al2.add(20);
        al2.add(30);
        al2.add(400);

        System.out.println(al1.retainAll(al2));
        System.out.println(al1);

        //
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println(arrayList);
        arrayList.remove(Integer.valueOf(1));
        System.out.println(arrayList);


        for (int i = 0; i < 100; i++) {
            Set<Integer> s = new LinkedHashSet<>();
            s.add(1);
            s.add(3);
            s.add(2);
            s.add(4);
            System.out.println(s);
        }
    }
}
