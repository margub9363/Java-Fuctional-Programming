package src.FP01.test;

import java.util.*;
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

        List<String> input = List.of("listen", "pot", "alas", "silent", "top","dinu","indu");
        Map<String,HashSet> output = new HashMap<>();
        List<char[]> inCharArrayFormat = input.stream().map(word -> word.toCharArray()).collect(Collectors.toList());
        String value;
        String key;
        for (char[] c:inCharArrayFormat) {
            value = new String(c);
            key = getString(c);
            if(output.containsKey(key)) {
                HashSet hashSet = output.get(key);
                hashSet.add(value);
                output.replace(key,hashSet);
            }
            else{
                HashSet<String> hasSetValue = new HashSet<>();
                hasSetValue.add(value);
                output.put(key,new HashSet<>(hasSetValue));
            }

        }
        System.out.println(output.values());
    }

    private static String getString(char[] inCharArrayFormat) {
        Arrays.sort(inCharArrayFormat);
        return new String(inCharArrayFormat);
    }
}
