package src.FP01.practice2;

public class Factorial {
    public static void main(String[] args) {
        int input=5;

        System.out.println("Factorial of " + input + " is: "+ getFactorial(input));
    }

    public static int getFactorial(int x) {
        if (x <= 1) {
            return x;
        }
        else return x * getFactorial(x-1);
    }
}
