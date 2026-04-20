package src.FP01.collect;

import java.util.*;
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
    }
}
