package src.personalPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Temp4 {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hello world",
                "Java streams are powerful",
                "flatmap is useful");

        // sentences.stream().map(str -> Arrays.stream(str.split(" ")).collect(Collectors.toList());
        List<String[]> collect1 = sentences.stream().map(str -> Arrays.stream(str.split(" ")))
        System.out.println(collect1);
        System.out.println("---------------------");


        ArrayList<List<Integer>> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(List.of(1,2,3,4));
        listOfIntegers.add(List.of(5,6,7,8));
        listOfIntegers.add(List.of(9,10,11,12));

        System.out.println(listOfIntegers);

        List<Integer> collect = listOfIntegers.stream().flatMap(x -> x.stream()).collect(Collectors.toList());

        List<Character> a = List.of('a', 'b', 'c', 'd', 'e');
        // a.stream().map(x -> x + "---").
        //        a.stream().flatMap(x -> (x + "---").stream()).
            //        a.stream().flatMap(x -> (x + "---").stream()).
        System.out.println(collect);
    }
}
