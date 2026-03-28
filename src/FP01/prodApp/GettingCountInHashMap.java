package src.FP01.prodApp;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GettingCountInHashMap {
    public static void main(String[] args) {
        List<String> languages = List.of("java", "python", "ruby", "javascript", "java");
        Map<String, Long> collect = languages.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

    }
}
