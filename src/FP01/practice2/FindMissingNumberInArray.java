package src.FP01.practice2;

public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int [] input = new int[] {1,2,3,4,5,7};

        /*
        Formula:
            n*(n+1)/2
         */

        for (int i=1; i<=input.length; i++) {
            if (input[i-1] != i) {
                System.out.println("Missing Number is : " + i);
            }
        }

    }
}
