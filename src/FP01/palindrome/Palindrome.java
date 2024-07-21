package src.FP01.palindrome;

public class Palindrome {
    public static void main(String[] args) {
        int number = 123321;
        char[] input = (number+"").toCharArray();
        for (int i=0; i<input.length-1; i++) {
            if(input[i] != input[input.length-1-i]) {
                System.out.println("Not a Palindrome");
                return;
            }
        }


    }
}
