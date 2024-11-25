package engineeringDigest;

import java.util.HashMap;
import java.util.Map;

public class IteratingOverMap {
    public static void main(String[] args) {
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        integerStringHashMap.put(1,"one");
        integerStringHashMap.put(2,"Two");
        integerStringHashMap.put(3,"three");
        integerStringHashMap.put(4,"one");
        integerStringHashMap.put(5,"Two");
        integerStringHashMap.put(6,"three");
        integerStringHashMap.put(7,"one");
        integerStringHashMap.put(8,"Two");
        integerStringHashMap.put(9,"three");
        integerStringHashMap.put(10,"one");
        integerStringHashMap.put(11,"Two");
        integerStringHashMap.put(12,"three");

        for ( Map.Entry<Integer, String> key: integerStringHashMap.entrySet()){
            System.out.println(key + ": "+ integerStringHashMap.get(key));
        }
    }
}
