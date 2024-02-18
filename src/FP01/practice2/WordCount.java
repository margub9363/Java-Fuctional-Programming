package src.FP01.practice2;

import java.util.*;

public class WordCount {
    public static void main(String[] args) {

     /* with For loop
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
        */

        /*
//        Through Stream Api and converting Charater Array of Wrapper Class to ArrayList
        String inputString = "MUMBAI";
        Character[] charArray = new Character[] {'M','U','M','B','A','I'};
//        List<Character> charaterArrayList = new ArrayList<>();
        List<Character> list = Arrays.asList(charArray); //this will work if the Array we are passing are of Wrapper Class , it should not be primitive class
        Map<Character,Integer> wordsCount = new HashMap<>();
        list.stream().forEach(character -> {
            if (wordsCount.containsKey(character))
                wordsCount.put(character,wordsCount.get(character)+1);
            else
                wordsCount.put(character,1);
        });
        System.out.println(wordsCount);
         */

        // If you want to convert via primitive class then you have to write one helper method
        String inputString = "MUMBAI";
        char[] charArray = inputString.toCharArray();
        List<Character> list = Arrays.asList(toObject(charArray));
        Map<Character,Integer> wordsCount = new HashMap<>();
        list.stream().forEach(character -> {
            if (wordsCount.containsKey(character))
                wordsCount.put(character,wordsCount.get(character)+1);
            else
                wordsCount.put(character,1);
        });
        System.out.println(wordsCount);

    }

    static Character[] toObject(char[] c){
        Character[] inWrapperClass = new Character[c.length];
        for (int i = 0; i < c.length; i++) {
            inWrapperClass[i] = c[i];
        }
        return inWrapperClass;
    }
}
