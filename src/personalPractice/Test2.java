package src.personalPractice;

import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface MathOperation {
    int getSquare(int n);
}
public class Test2 {
    public static void main(String[] args) {
        MathOperation mathOperation = (n) -> n*n;
        System.out.println("Square of a Number is : " + mathOperation.getSquare(2));

        Function<Integer, String> doubleIt = (n) -> n*2+"----------";
        System.out.println(doubleIt.apply(2));

        Predicate<Integer> isEven = (n) -> n%2==0;
        System.out.println(isEven.test(23));

        System.out.println(Function.identity());
    }
}
