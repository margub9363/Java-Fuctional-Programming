package src.FP01.practice2;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class FindTheCommonElementsInTwoArray {
    public static void main(String[] args) {
        int[] firstArray = new int[] {1,2,3,4,5,6,7};
        int[] secondArrayArray = new int[] {45,2,85,4,5,66,7};

        // Traditional Way
        /*for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArrayArray.length; j++) {
                if (firstArray[i]==secondArrayArray[j]) {
                    System.out.println("Common Element: "+ firstArray[i]);
                }
            }
        }*/

        //  Second way
        Set<Integer> firstArrayElements = new HashSet<>();
        for (int i = 0; i < firstArray.length; i++) {
            firstArrayElements.add(firstArray[i]);
        }
        for (int i = 0; i <secondArrayArray.length; i++) {
            if(firstArrayElements.contains(secondArrayArray[i])){
                System.out.println("Common Element(2): "+ secondArrayArray[i]);
            }
        }
    }
}
