package src.FP01;

import java.util.List;

public class Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 3, 54, 532, 23, 23, 45, 23);
//        printAllNumbersInListFunctional(numbers);
        printEvenNumber(numbers);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers){
        numbers.stream().forEach(number -> System.out.println(number));
    }
    private static void printEvenNumber(List<Integer> numbers) {
        numbers.stream().filter(number -> number%2==0).forEach(toPrinnt -> System.out.println(toPrinnt));
    }

}
