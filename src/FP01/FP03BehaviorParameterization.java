package src.FP01;

import java.util.List;
import java.util.function.Predicate;

public class FP03BehaviorParameterization {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);

//        Logic to print Even Number
        Predicate<Integer> eventPredicated = number -> number % 2 == 0;
//        numbers.stream().filter(eventPredicated) .forEach(System.out::println);

//        Logic to Print Odd Numbers
        Predicate<Integer> oddPredicate = number -> number % 2 != 0;
//        numbers.stream().filter(oddPredicate) .forEach(System.out::println);
//        In the above line we can see that a lot of line has been duplicated

        extracted(numbers, eventPredicated); // now with this code we can remove the most of the duplication
        extracted(numbers, oddPredicate); 
    }


    private static void extracted(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream().filter(predicate) .forEach(System.out::println);
    }

}
