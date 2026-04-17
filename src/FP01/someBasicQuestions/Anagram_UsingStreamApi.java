package src.FP01.someBasicQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
List of Words :
Listen  Pot  Alas  Silent  Top
Output : Print sets of anagrams (Listen, Silent), (Pot, Top)
*/

public class Anagram_UsingStreamApi {
    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("Listen", "Pot", "Alas", "Silent", "Top");
        Map<String, List<String>> collect = inputList.stream().collect(Collectors.groupingBy(word ->
                word.toLowerCase().chars().sorted().mapToObj(w -> String.valueOf((char) w)).collect(Collectors.joining())
        ));
        System.out.println(collect);
    }
}
