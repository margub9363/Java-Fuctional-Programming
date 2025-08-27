package src.FP01.practice2;

public class SumOfDigitsOfaNumber {
    // one way
    /*public static povoid main(String[] args) {
        int input = 12345;
        int sum=0;
        char[] charArray = (input + "").toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            sum = sum + charArray[i]-48;
        }
        System.out.println(sum);
    }*/

    // other way
    public static void main(String[] args) {
        int input=12345;
        int sum=0;

        while (input!=0) {
            sum = sum + (input%10);
            input = input / 10;
        }

        System.out.println("Sum is: " + sum);
    }

}
