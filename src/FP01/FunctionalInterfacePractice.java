package src.FP01;

import java.util.List;
import java.util.function.*;

public class FunctionalInterfacePractice {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,34,5,6,7,8,34,6);

//        Predicate
//        Predicate functional Interface indicates that i/p can be anything but the o/p will always be a boolean
        Predicate<Integer> isEvenPredicate = x -> x%2 ==0;

//        In the below Function functional interface both the argument is an Integer, which implies that the i/p and o/p will be the Integer
        Function<Integer, Integer> squareFunction = x -> x*x;

//        Function
//        In the below functional interface the second argument is a String, which implies that the output will be the String
        Function<Integer, String> dummyFunctionToReturnString = x -> x + " ";

//        Consumenr is one of the Functional Interface where i/p can be anything but the o/p has to be void
        Consumer<Integer> sysoutConsumer = x -> System.out.println(x);

//        Binary Operator is a functional Interface which will take two input of same type and return the o/p in same type. So no need ot mention 3 times.
        BinaryOperator<Integer> sumBianryOperator = (x,y) -> x+y;

//        Supplier
//        This is also one of the Functional Interface where there will be a no input but will be having a output
        Supplier<Integer> randomIntegerSupplier = () -> 2;
        Supplier<String> testing = () -> "Hello World!";

//        Unary Operator
//        Unary Operator is a functional interface which will take the single input of any type and then return the output of same type with some operation performed in it.
        UnaryOperator<Integer> unaryOperator = x -> x*2;

    }
}
