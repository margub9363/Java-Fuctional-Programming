package src.FP01.altimetrik;

import java.util.Arrays;

/*
Given an unsorted integer array, find a triplet with a given sum in it.(without using predefined functions)
Input:
nums = { 1, 3, 2, 7, 4, 0, 9, 5 }
target = 6
Output: Triplet exists.
The triplets with the given sum 6 with sorted are {0, 1, 5}, {0, 2, 4}, {1, 2, 3}
*/
public class P2 {
    public static void main(String[] args) {
        int [] input = new int[] { 1, 3, 2, 7, 4, 0, 9, 5 };
        int target = 6;

//        Arrays.sort(input);
        for (int i =0; i<input.length; i++) {
            for (int j=i; j<input.length; j++) {
                for (int k=j; k<input.length; k++) {
                    if (input[i]+input[j]+input[k] ==6 & input[i]!=input[j] && input[j]!=input[k]) {
                        System.out.println(input[i]+" "+input[j]+" "+input[k]);
                    }
                }
            }
        }

    }
}
