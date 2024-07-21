package src.FP01.july20th;

public class ReverseString {
    public static void main(String[] args) {
        char[] charArray = "Rahman".toCharArray();

        int temp =0;
        for (int i =charArray.length-1; i>=0; i--){
            System.out.print(charArray[i]);
        }


    }
}
