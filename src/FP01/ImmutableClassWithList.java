package src.FP01;

import java.util.ArrayList;
import java.util.List;

public class ImmutableClassWithList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        ImmutableClass immutableClass = new ImmutableClass(1, list);

        immutableClass.getList().add(7);
        // System.out.println(list1);
    }
}

final class ImmutableClass {
    final int id;
    final List<Integer> list;


    public ImmutableClass(int id, List<Integer> list) {
        this.id = id;
        this.list = list;
    }

    public int getId() {
        return id;
    }

    public List<Integer> getList() {
        return list;
    }

//    public List<Integer> getList() {
//        return Collections.unmodifiableList(list);
//    }
}
