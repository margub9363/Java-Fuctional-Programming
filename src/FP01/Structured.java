package src.FP01;

import java.util.List;

public class Structured {
    public static void main(String[] args) {
        printAllNumbersInListStructured(List.of(12,3,54,532,23,23,45,23));
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
//        how to loop the numbers?
        for (int number:numbers){
            System.out.println(number);
        }
    }

}
