package src.FP01.practice2;

import java.util.*;

public class WordCount {
    public static void main(String[] args) {

        String inputString = "MUMBAI";
        char[] charArray = inputString.toCharArray();
//        TreeMap<Character,Integer> wordsCount = new TreeMap<>(); // if you want in sorted order
        Map<Character,Integer> wordsCount = new HashMap<>();

        for (int i=0; i<charArray.length; i++) {
            if(wordsCount.containsKey(charArray[i])) {
                wordsCount.replace(charArray[i],wordsCount.get(charArray[i])+1);
            }
            else wordsCount.put(charArray[i],1);
        }

        System.out.println(wordsCount);
    }
}
