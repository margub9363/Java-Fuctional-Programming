package src.FP01.infogain;

import java.util.HashSet;

// Lets take input as "rahman" , now we have to pint elements till the first non-repeating character is encountered
// output -> rahm
public class PrintTillFirstNonRepeatedCharacter {
    public static void main(String[] args) {
        char[] charArray = "rahman".toCharArray();
        HashSet<Character> characters = new HashSet<>();
        for (int i = 0; i < charArray.length; i++) {
            if(characters.contains(charArray[i])) {
               break;
            }
            System.out.print(charArray[i]);
            characters.add(charArray[i]);
        }
    }
}
