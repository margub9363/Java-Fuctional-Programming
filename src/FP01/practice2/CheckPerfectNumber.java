package src.FP01.practice2;

// A perfect number is a positive integer that is equal to the
// sum of its proper divisors (divisors excluding the number itself).
// ex: 6 <- 1,2,3 => 1+2+3 =6
// 28 -> 1,2,4,7,14
//6, 28, 496, 8128, 33550,
public class CheckPerfectNumber {
    public static void main(String[] args) {

        int input = 496;
        int sumOfDivisor = 0;
        for (int i = 1; i <=input/2; i++) {
            if(input % i == 0) {
                sumOfDivisor = sumOfDivisor + i ;
            }
        }
        if (sumOfDivisor == input)
            System.out.println("Its a perfect number");
    }
}
