package src.FP01.aptiPro;

public class PrintFibonacciSeries {
    public static void main(String[] args) {

        int input = 7;
        fibonacci(input);
    }
    public static void fibonacci(int N)
    {
        int secondPreviousValue = 0;
        int justPreviousValue = 1;
        int temp = 0;
        System.out.print("0 1 ");
        for (int i = 2; i < N; i++) {
            temp = secondPreviousValue + justPreviousValue;
            System.out.print(temp + " ");
            secondPreviousValue = justPreviousValue;
            justPreviousValue = temp;
        }
    }
}
