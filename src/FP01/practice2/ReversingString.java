package src.FP01.practice2;

public class ReversingString {
    public static void main(String[] args) {
        char[] input = "Apple".toCharArray();
        for (int i = input.length-1; i > -1; i--) {
            System.out.print(input[i]);
        }
    }
}

