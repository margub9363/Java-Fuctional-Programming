package src.FP01.practice2;

public class CountVowelsAndConsonent {
    public static void main(String[] args) {
        char[] input = "automation".toCharArray();
        int vowelCount = 0, consonentCount = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 'a' || input[i] == 'e' || input[i] == 'i' || input[i] == 'o' || input[i] == 'u') {
                vowelCount++;
            } else {
                consonentCount++;
            }
        }
        System.out.println("Input: " + new String(input));
        System.out.println("Vowles count: " + vowelCount);
        System.out.println("Consonent count: " + consonentCount);
    }
}
