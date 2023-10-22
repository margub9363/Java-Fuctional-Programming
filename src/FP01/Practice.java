package src.FP01;

import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,1);
//        sumOfNumbersUsingReduceMethod(integers);
//        squareEveryNumberInListAndSumThem(integers);
//        sumofOddNumbers(integers);
        printDistict(integers);
    }

    private static void printDistict(List<Integer> integers) {
        integers.stream().distinct().forEach(System.out::println);
    }

    private static void sumofOddNumbers(List<Integer> integers) {
        Integer result = integers.stream().filter(integer -> integer % 2 != 0).reduce(0, Integer::sum);
        System.out.println(result);
    }

    private static void sumOfNumbersUsingReduceMethod(List<Integer> inputList){
        Integer result = inputList.stream().reduce(20, (x, y) -> x + y);
        System.out.println(result);
    }

    private static void squareEveryNumberInListAndSumThem(List<Integer> input) {
        Integer result = input.stream().map(number -> number*number).reduce(0, (x, y) -> x + y);
        System.out.println(result);
    }
}
