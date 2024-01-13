package src.FP01.test;

// Finding Longest word that should has word length in even digits"
public class LongestEvenCountWord {
    public static void main(String[] args) {
        String input = "How is everything going";
        solution(input);
    }

    private static void solution(String input) {
        String[] words = input.split(" ");
        int longestWordCount = 0;
        String longestWord = null;
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()%2==0 && words[i].length()>longestWordCount) {
                longestWord = words[i];
            }
        }

        System.out.println("Longest Even Count Word is : " + longestWord);
    }
}