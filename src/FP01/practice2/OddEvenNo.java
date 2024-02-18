package src.FP01.practice2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddEvenNo {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumber = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        List<Integer> oddNumber = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());

        List<Integer> collect = numbers.stream().filter(x -> x == 3).collect(Collectors.toList());

        System.out.println("Even Numbers: ");
        System.out.println(evenNumber);

        System.out.println("ODD Numbers: ");
        System.out.println(oddNumber);


    }
}
