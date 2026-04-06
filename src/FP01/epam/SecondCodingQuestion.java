package src.FP01.epam;

import java.util.*;
import java.util.function.Function;

// Using Sream API write a code to find the second longest word
//Ex: How is everything going // Answer: going

class StringLenComparotor implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return 0;
    }
}

public class SecondCodingQuestion {
    public static void main(String[] args) {
        String[] inputStingArray = "How is everything going".split(" ");
        List<String> list = Arrays.asList(inputStingArray);
        Function<char[], Integer> sorting = arr -> arr.length;

        List<Integer> list1 = List.of(1, 2, 3, 4,3,64,23,6,34,6,8);
        Integer[] array = list1.toArray(new Integer[0]);
        for (int i = 0; i < array.length; i++) {
            // System.out.println(array[i]);
        }

        // list1.stream().sorted( (a,b)-> a-b).forEach(System.out::println);
        // list1.stream().sorted( new StringLenComparotor()).forEach(System.out::println);
//        list1.stream().sorted(Comparator.comparing(String::length));
//        list.sort();

        List<String> list9 = new ArrayList<>(List.of("a", "ccc", "bb"));
        list9.sort(Comparator.comparing(String::length));

        System.out.println(list); // [a, bb, ccc]

        list.stream()
                .sorted(Comparator.comparing(String::length))
                .toList();
    }
}
