package src.FP01.aptiPro;

public class ReplaceCharactersInString {
    public static void main(String[] args) {

        String input = "Hello";
        char oldChar = 'l';
        char newChar = 'x';
        replaceCharactersInString(input,oldChar,newChar);
        System.out.println(replaceCharactersInString(input,oldChar,newChar));
    }

    public static String replaceCharactersInString(String str,char oldChar,char newChar)
    {
        // Write your logic here
        char[] charArray = str.toCharArray();
        for (int i =0; i<charArray.length; i++) {
            if (charArray[i] == oldChar)
                charArray[i] = newChar;
        }
        return new String(charArray);
    }
}
