package src.FP01.test;

//"Rahman"; <-- a
public class P2 {
    public static void main(String[] args) {

        String input = "rahman";
        char[] charArray = input.toCharArray();

        boolean isRepeatingChararcterFound = false;
        for (int i=0; i<charArray.length-1; i++) {
            for (int j=i+1; j<charArray.length; j++) {
                if(charArray[i]==charArray[j] ) {
                    System.out.println("Repeating Character : "+ charArray[i]);
                    isRepeatingChararcterFound = true;
                }
            }
        }

        if (!isRepeatingChararcterFound) System.out.println("No Repeating Character Found");
    }
}
