package src.FP01.practice2;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        int lowerLimit = 2;
        int upperLimit = 29;

        printPrimeNumbersInRange(lowerLimit, upperLimit);
    }

    public static void printPrimeNumbersInRange(int lowerLimit, int upperLimit) {
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (isPrime(i))
                System.out.print(i+" ");
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <=Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
