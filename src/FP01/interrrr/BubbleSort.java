package src.FP01.interrrr;

public class BubbleSort {
    public static void main(String[] args) {
        int [] input = new int[] {8,345,6,45,234,34,6};

        int temp= -1;
//        for binary search
        for (int i=0; i<input.length-1; i++) {
            for (int j=i; j<input.length-1-i; j++) {
                if (input[j]>input[j+1]) {
                    temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }

        for (int i=0; i<input.length; i++) {
            System.out.print(input[i]+ " ");
        }
    }
}
