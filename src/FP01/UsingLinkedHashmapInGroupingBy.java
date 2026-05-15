package src.FP01;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class UsingLinkedHashmapInGroupingBy {
    public static void main(String[] args) {
        LinkedHashMap<Character, Long> collect = "rahman"
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);
    }
}