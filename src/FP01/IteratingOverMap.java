package src.FP01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratingOverMap {
    public static void main(String[] args) {
        System.out.println("Program Starts---------------");

        Map<Integer,String> details = new HashMap<>();
        details.put(1,"Rahman");
        details.put(2,"Margub");
        details.put(3,"Tannu");

//       Using Stream API
        details.keySet().stream().forEach( key -> System.out.println(details.get(key)));

//        using forEach loop
        details.forEach( (key,value) -> {
            System.out.println("Key : " + key +" and Value is : "+ value);
        });

//        using set with enhanced for loo
        for (int id : details.keySet()) {
            System.out.println("Key is : "+ id + " Value is : "+  details.get(id));
        }

//        using iterator
        Iterator<Map.Entry<Integer, String>> iterator = details.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println("Key : "+ next.getKey() + " and value is : "+next.getValue());
        }
    }
}
