package src.FP01.practice2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import static java.lang.System.exit;

public class FirstRepeatingAndNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        char[] charArray = input.toCharArray();
        LinkedHashMap<Character,Integer> wordCounts = new LinkedHashMap<>();

        for (int i = 0; i < charArray.length; i++) {
            if (wordCounts.get(charArray[i])!=null) {
                wordCounts.put(charArray[i],wordCounts.get(charArray[i])+1);
            } else wordCounts.put(charArray[i],1);
        }
        System.out.println(wordCounts);
        getTheFirstNonRepeatingCharacter(wordCounts);
    }
    private static void getTheFirstNonRepeatingCharacter(LinkedHashMap<Character,Integer> wordsCount) {

        wordsCount.entrySet().stream().filter(es -> es.getValue() == 1)
                .findFirst()
                .ifPresent(es -> System.out.println("First Non-Repeating Character is: " + es.getKey()));
    }
}
