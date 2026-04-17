package src.FP01.someBasicQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestEvenCountWordUsingStreams {
    public static void main(String[] args) {
        String input = "How is Everything going";
        List<String> list = Arrays.asList(input.split(" "));
        List<char[]> inputInCharacterArray = list.stream().map(word -> word.toCharArray()).collect(Collectors.toList());
        List<String> collect = inputInCharacterArray.stream().sorted((a, b) -> a.length - b.length).map(word -> String.valueOf(word)).collect(Collectors.toList());

        // second largest word
        System.out.println("Second Largest word is : " + collect.get(collect.size() - 2));
    }
}
