package src.FP01.interview;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
input - sssachin
output - sachin
 */
public class P1 {
    public static void main(String[] args) {
//        ArrayList<Character> input2 =  new ArrayList<>();
        String input = "sssachin";
        List<Character> input2 = input.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        input2.stream().distinct().forEach(System.out::print);

    }
}
