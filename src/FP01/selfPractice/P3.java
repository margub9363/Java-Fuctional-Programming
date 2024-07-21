package src.FP01.selfPractice;

import java.util.HashMap;
import java.util.Map;

public class P3 {
// word count -> MUMBAI
    public static void main(String[] args) {

        String input = "MUMBAI";
        char[] inputCharArray = input.toCharArray();

        Map<Character,Integer> wordCounts = new HashMap<>();
        for (int i=0; i<inputCharArray.length; i++){
            wordCounts = wordCountFunctionality(inputCharArray[i],wordCounts);
        }
        System.out.println(wordCounts);
    }
    public static Map<Character,Integer> wordCountFunctionality(Character c, Map<Character,Integer> wordCounts) {
        if (wordCounts.get(c)!=null) {
            wordCounts.put(c,wordCounts.get(c)+1);
        }
        else wordCounts.put(c,1);
        return wordCounts;
    }
}
