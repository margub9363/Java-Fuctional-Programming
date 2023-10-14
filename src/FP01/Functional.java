package src.FP01;

import java.util.List;

public class Functional {
    public static void main(String[] args) {
        printAllNumbersInListFunctional(List.of(12,3,54,532,23,23,45,23));
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers){
        numbers.stream().forEach(number -> System.out.println(number));
    }

}
