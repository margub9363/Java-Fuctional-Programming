package src.FP01.test;

import java.util.Arrays;

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
    }
}
