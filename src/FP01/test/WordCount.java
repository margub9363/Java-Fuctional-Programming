package src.FP01.test;

// This is to program to count the  no of alphabets in a given string.
public class WordCount {
    public static void main(String[] args) {
        String input = "A quick brown fox jumps over a lazy dog.";
        input = input.toLowerCase();
        char[] inputInArrayFormat = input.toCharArray();
        int[] alphabetArrayCount = new int[26];

        for (char c: inputInArrayFormat
             ) {
            if((int)(c)>96 && (int)(c)<123){
                alphabetArrayCount[(int)(c)-1-96] = alphabetArrayCount[(int)(c)-1-96] +1;
            }
        }
        for (int i = 0; i < alphabetArrayCount.length; i++) {
            System.out.println((char)(i+96+1)+ " : " + alphabetArrayCount[i] + " ");

        }
    }
}
