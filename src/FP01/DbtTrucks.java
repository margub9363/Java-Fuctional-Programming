package src.FP01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DbtTrucks {
    public static void main(String[] args) {
//        char[] input = "Margub Rahman".toLowerCase().toCharArray();
        char[] input = "A quick brown fox jumps over a lazy dog".toLowerCase().toCharArray();
//        wordFrequency(input);

        Map<Character, Integer> wordCount = new HashMap<>();
        String ip2 = "A quick brown fox jumps over a lazy dog";
        List<Character> collect = ip2.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        collect.stream().forEach(x -> {
            if (wordCount.containsKey(x)) {
                wordCount.put(x, wordCount.get(x) + 1);
            } else {
                wordCount.put(x, 1);
            }
        });
        System.out.println(wordCount);
    }

    private static void wordFrequency(char[] input) {
        int[] alphabetArray = new int[26];
        for (int i = 0; i < input.length; i++) {
            if (input[i] != ' ') {
                alphabetArray[(int) input[i] - 97]++;
            }
        }
        for (int i = 0; i < alphabetArray.length; i++) {
            if (alphabetArray[i] != 0) {
                System.out.println((char) (i + 97) + "  " + alphabetArray[i]);
            }
        }
    }


}
