package src.FP01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,1);
        List<List<Integer>> lists = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
//        System.out.println("Before Flattening");
//        System.out.println(lists);
//        List<Integer> collect = lists.stream().flatMap(Collection::stream).collect(Collectors.toList());
//        System.out.println("After Flattening");
//        System.out.println(collect);
//        sumOfNumbersUsingReduceMethod(integers);
//        squareEveryNumberInListAndSumThem(integers);
//        sumofOddNumbers(integers);
//        sumOfNumbersUsingReduceMethod(integers);
//        printDistict(integers);

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        int[] ints = new int[] {1, 2, 45, 6, 7};
        List<Integer> collect = Arrays.stream(ints).boxed().collect(Collectors.toList());
        char[] charArray = "hello".toCharArray();
        List<Character> collect1 = "hello".chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    }


    private static void printDistict(List<Integer> integers) {
        integers.stream().distinct().forEach(System.out::println);
    }

    private static void sumofOddNumbers(List<Integer> integers) {
        Integer result = integers.stream().filter(integer -> integer % 2 != 0).reduce(0, Integer::sum);
        System.out.println(result);
    }

    private static void sumOfNumbersUsingReduceMethod(List<Integer> inputList){
        Integer result = inputList.stream().reduce(0,(x,y) -> x+y );
        System.out.println(result);
    }

    private static void squareEveryNumberInListAndSumThem(List<Integer> input) {
        Integer result = input.stream().map(number -> number*number).reduce(0, (x, y) -> x + y);
        System.out.println(result);
    }



}
