package src.FP01.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice10 {
    public static void main(String[] args) {
//i/p
//        DDDYYTTDD
//o/p
//        3D2Y2T2D

        String input = "DDDYYTTDD";
        char[] charArray = input.toCharArray();
        int count = 1;
        for (int i = 0; i < charArray.length; i++) {
            if (i<charArray.length-1  && charArray[i]==charArray[i+1]){
                count++;
            }
            else {
                System.out.print(count+""+charArray[i]);
                count = 1;
            }
        }

//        I will take the Alphabet Approach to count the idniviual alphabets


//        I will take the Map approach to count the idniviual alphabets
        System.out.println();
        input="asdfghjQWSDCFVBN oijhgcDFV  B";
        System.out.println("Starting the Map approach to count individual character");
        char[] forMapApproach = input.toCharArray();
        Map<Character,Integer> individualWordCount = new HashMap<Character, Integer>();
        for(char c: forMapApproach) {
            if (individualWordCount.containsKey(c)) {
                individualWordCount.replace(c, individualWordCount.get(c) + 1);
            } else individualWordCount.put(c, 1);
        }
        System.out.println(individualWordCount);
    }
}
