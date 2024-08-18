package src.FP01.cagemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Practice2 {

    public static boolean indicator = false;
    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>();
        IntStream range = IntStream.range(1, 101);
        range.forEach(ip-> inputList.add(ip));
//        inputList.stream().forEach(System.out::println);


        boolean flag = false;
//        inputList.forEach( input-> {
        inputList.forEach( input-> {
            indicator = false;
            System.out.println();
            System.out.println("for ----------------------"+ input);
            for (int i=2; i<(input-1); i++) {
                if(input%i==0) {
                    System.out.print(i + " ");
                    indicator = true;
                }
            }
            if (!indicator)
            System.out.println(input);
        });
    }
}
