package src.FP01;

import java.util.*;

/*
We have got the complete setup and asked to group the similar words like {abc=[abc, cba, bca], def=[def, fed]}
// Note: hashCode method is missing from the Actual Object
 */

public class AnagramWithObject {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<Word> words = Arrays.asList(
                new Word("abc"),
                new Word("cba"),
                new Word("def"),
                new Word("bca"),
                new Word("fed")
        );

        // -----------------Our Implementation
//         Map<Word, List<Word>> output = words.stream().collect(Collectors.groupingBy(x-> new Word(String.valueOf())),Collectors.toList());

        Map<Word, List<Word>> output = new HashMap<Word, List<Word>>();

        for (Word word : words) { //cba
            char[] key = word.getLetters();
            Word valueee = new Word(String.valueOf(key));
            Arrays.sort(key);
            Word keyyyy = new Word(String.valueOf(key));
            System.out.println("----------------------1");
            System.out.println(keyyyy);
            System.out.println(valueee);
            System.out.println("----------------------2");

            if (output.containsKey(keyyyy)) {
                List<Word> words1 = output.get(keyyyy);

                words1.add(valueee);
                output.put(keyyyy, words1);
            } else {
                List<Word> temp2 = new ArrayList<>();
                temp2.add(word);
                output.put(keyyyy, temp2);
            }
        }

        System.out.println(output);

        // -----------------Our Implementation
    }
}


class Word {
    private final char[] letters;
    public Word(String s) {
        this.letters = s.toCharArray();
    }
    public char[] getLetters() {
        return letters;
    }
    @Override
    public String toString() {
        return new String(letters);
    }

    // -----------------Our Implementation
    @Override
    public int hashCode() {
        return Arrays.hashCode(letters);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Arrays.equals(letters, word.letters);
    }
    // -----------------Our Implementation
}