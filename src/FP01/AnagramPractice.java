package src.FP01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramPractice {
    public static void main(String[] args) {
        List<String> inputList = List.of("listen", "pot", "alas", "silent", "top", "dinu", "indu");
        HashMap<String,String> output = new HashMap();
        char[] wordsInCharArray;
        String key;
        for (String str: inputList
             ) {
            wordsInCharArray = str.toCharArray();
            Arrays.sort(wordsInCharArray);
            key =  String.valueOf(wordsInCharArray);
            if(output.containsKey(key)){
                String o = output.get(key);
                o =  o + "," + str;
                output.put(key,o);
            }
            else {
                output.put(key,str);
            }
        }
        System.out.println(output);

    }
}
