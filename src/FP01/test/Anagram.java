package src.FP01.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        /*
        4) List of Words :
Listen
Pot
Alas
Silent
Top
Output : Print sets of anagrams (Listen, Silent), (Pot, Top)
*/
        List<String> input = List.of("listen", "pot", "alas", "silent", "top");
        List<char[]> inputInArrayFormat = input.stream().map(str -> str.toCharArray()).collect(Collectors.toList());
        List<String > sortedString = new ArrayList<>();
        for (char[] c: inputInArrayFormat) {
            Arrays.sort(c);
            sortedString.add(new String(c));
        }

}
}
