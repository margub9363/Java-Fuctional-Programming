package src.FP01.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
input - aabbbcc
output - a2b3c2

 */
public class P2 {
    public static void main(String[] args) {
        ArrayList<Character> input2 =  new ArrayList<>();
        String input = "aabbbcc";
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            input2.add(charArray[i]);
        }
        HashMap<Character,Integer> tracker = new HashMap<>();
        input2.stream().forEach(c-> logic(tracker,c));

        tracker.keySet().stream().forEach( k -> System.out.print(k+""+tracker.get(k)));

    }

    public static  HashMap<Character,Integer> logic ( HashMap<Character,Integer> tr,Character c) {
        int count = 0;
        if (tr.get(c) != null) {
            count = tr.get(c);
            tr.put(c,count+1);
        }
        else tr.put(c,1);
        return tr;
    }
}
