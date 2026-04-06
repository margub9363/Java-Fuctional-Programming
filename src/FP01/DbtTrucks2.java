package src.FP01;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class DbtTrucks2 {
    public static void main(String[] args) {
        IntStream chars = "rahman".chars();
        List<Character> collect = chars.mapToObj(c -> (char) c).collect(Collectors.toList());
        System.out.println(collect);

    }
}
