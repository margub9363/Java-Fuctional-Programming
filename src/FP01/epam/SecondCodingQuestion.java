package src.FP01.epam;

import java.util.*;

// Using Sream API write a code to find the second longest word
//Ex: How is everything going // Answer: going

public class SecondCodingQuestion {
    public static void main(String[] args) {
        String[] inputStingArray = "How is everything going".split(" ");
        List<String> list = Arrays.asList(inputStingArray);

        // list.stream().
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        System.out.println(integers);
    }
}
