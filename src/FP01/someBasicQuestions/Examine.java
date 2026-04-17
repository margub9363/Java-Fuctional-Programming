package src.FP01.test2;


//First Non-repeating charatctor in a string - swiss ->>

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Examine {
    public static void main(String[] args) {
//        String input = "swiss";
        ArrayList<Character> input = new ArrayList<>();
        input.add('s');
        input.add('w');
        input.add('i');
        input.add('s');
        input.add('s');

        Map<Character,Integer>  count = new HashMap<>();

        input.stream().forEach(c -> {
            if(count.get(c) != null) {
                count.put(c,count.get(c)+1);
            }else count.put(c,1);
        });

        for (Character c: input) {
            if(count.get(c) == 1) {
                System.out.println("First Non repeating Character : "+ c);
                return;
            }
        }
    }
}
