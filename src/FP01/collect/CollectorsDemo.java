package src.FP01.collect;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        // 1 Collecting to a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> res = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(res
        );

        // Collecting to a Set
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        System.out.println(set);

        // Collecting to a Specified Stream
        ArrayDeque<String> collect = names.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));

        // Joining Steams
        String joinedNames = names.stream().map(name-> name.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(joinedNames);

        // Summarizing Data
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        IntSummaryStatistics collect1 = numbers.stream().collect(Collectors.summarizingInt(num -> num));
        System.out.println(collect1);
        System.out.println(collect1.getMax());

        // Counting Elements
        Long count = numbers.stream().collect(Collectors.counting());
        System.out.println("Count is ");
        System.out.println(count);

        // Grouping Elements
        List<String> words = Arrays.asList("hello", "world", "java", "streams", "collecting");
        Map<Integer, List<String>> groupingByWordLength = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupingByWordLength);
        System.out.println();
        
        //
        System.out.println("wordsJoinedWith --- ");
        String wordsJoinedWith = words.stream().collect(Collectors.joining(" --- "));
        System.out.println(wordsJoinedWith);
        System.out.println();

        //joining similar group of words
        System.out.println("joining similar group of words");
        Map<Integer, String> joinedSimilarGroupOfWords = words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", ")));
        System.out.println(joinedSimilarGroupOfWords);
        System.out.println();

        // Partitioning Elements
        //ex1
        int[] randomNumbers = new int[] {2,3,4,5,6,7,8,8,9,9,0,34};
        List<Integer> randomIntegerLists = Arrays.stream(randomNumbers).mapToObj(num -> (Integer) num).collect(Collectors.toList());
        Map<Boolean, List<Integer>> oddEvenMap = randomIntegerLists.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(oddEvenMap);
        System.out.println();

        // Some more Examples

        // ex 1  Collecting Names By Length
        System.out.println("Names By Length");
        List<String> l1 = Arrays.asList("Anna", "Bob", "Alexander", "Brian", "Alice");
        Map<Integer, List<String>> namesByLength = l1.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(namesByLength);
        System.out.println();

        // ex 2 Counting Words Occurrence
        System.out.println("Counting Words Occurrence");
        String sentence = "hello world hello java world";
        Map<String, Long> countingWordOccurrence = Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(countingWordOccurrence);


    }
}
