package engineeringDigest;

import java.util.List;

public class ListExperiment {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4);
        Object[] array = list.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("******************");
        Integer[] array1 = list.toArray(new Integer[0]); // << It is just a convention that we write 0
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

    }
}
