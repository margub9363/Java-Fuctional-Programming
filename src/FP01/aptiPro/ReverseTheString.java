package src.FP01.aptiPro;

public class ReverseTheString {
    public static void main(String[] args) {
        String inputString = "Rahman";
        reverseString(inputString);
        System.out.println(reverseString(inputString));
    }

    public static String reverseString(String str) {
        // Write your logic here
        char[] charArray = str.toCharArray();
        String output = "";
        for (int i = charArray.length-1; i >= 0; i--) {
            output = output + charArray[i];
        }
        return output;
    }
}
