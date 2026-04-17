package src.FP01.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//   int [] <--
public class P3 {
    public static void main(String[] args) {
        int []input = new int[] {1,2,3,4,5};

        List<Integer> inputList = new ArrayList<>();
        for (int i=0; i<input.length; i++){
            inputList.add(i);
        }

//        Arrays.stream()
        
        long count = inputList.stream().map(i -> i * i).filter(inp -> inp > 20).count();
        System.out.println("Expected Coiunt :" + count);
    }
}
