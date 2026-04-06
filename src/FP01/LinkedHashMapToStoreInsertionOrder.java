package src.FP01;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapToStoreInsertionOrder {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println(map);
    }
}
