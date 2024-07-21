package src.FP01.test;

import java.util.HashSet;
import java.util.Set;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "character";
        char[] charArray = input.toCharArray();
        Set<Character> testingSet = new HashSet<>();
        for (char c : charArray) {
            int beforeAddingValue = testingSet.size();
            testingSet.add(c);
            int afterAddingNewCharacter = testingSet.size();
            if (beforeAddingValue == afterAddingNewCharacter){
                System.out.println("First Non Repeating Character :" + c);
                return;
            }
        }
    }
}
