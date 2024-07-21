package src.FP01.selfPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P4 {
    public static void main(String[] args) {

        List<String> inputList = List.of("listen", "silent", "pot", "alas", "top", "dinu", "indu");

        Map<String,String> anagrams = new HashMap<>();
        inputList.stream().forEach(word -> anagramFunctionality(word,anagrams));
        System.out.println(anagrams);

    }
    public static  Map<String,String> anagramFunctionality(String word,  Map<String,String> anagrams) {
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        String key = new String(charArray);
        if(anagrams.get(key)!= null) {
            String values = anagrams.get(key);
            values = values + ", "+ word;
            anagrams.put(key,values);
        }
        else anagrams.put(key,word);
        return anagrams;
    }
}
