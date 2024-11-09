package src.FP01.interview;


import java.util.ArrayList;
import java.util.Collections;

/*
input - sssachin
output - sachin
 */
public class P1 {
    public static void main(String[] args) {
        ArrayList<Character> input2 =  new ArrayList<>();
        String input = "sssachin";
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            input2.add(charArray[i]);
        }

        input2.stream().distinct().forEach(System.out::print);

    }
}
