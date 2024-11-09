package src.FP01.practice2;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertingArrayIntoCollection {
    public static void main(String[] args) {

//        for integers
        int[] input = new int[] {1,2,3,4,5,6,7,8,9,10};
        IntStream stream = Arrays.stream(input);
        stream.forEach(System.out::println);

//        for String
//        String name = "Rahman";
//        Stream<Character> charStream = IntStream.range(0, name.toCharArray().length).map(i -> name.toCharArray()[i]);
//        intStream.forEach(System.out::println);

        char[] charArray = {'a', 'b', 'c', 'd'};
        Stream<Character> charStream = IntStream.range(0, charArray.length)
                .mapToObj(i -> charArray[i]);

        charStream.forEach(System.out::println);
    }
}
