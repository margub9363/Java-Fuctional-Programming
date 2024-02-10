package src.FP01.test;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        firstNonRepeatingCharacter("character");
//        firstNonRepeatingCharacter("abcdac");
    }

    static void firstNonRepeatingCharacter(String input) {
        char[] inputCharacterArray = input.toCharArray();
        int[] alphabet = new int[25];
        for (int i=0; i<inputCharacterArray.length; i++) {
            alphabet[(int)(inputCharacterArray[i])-97]=alphabet[(int)(inputCharacterArray[i])-97]+1;
        }
//        for (int i=0; i<26; i++) {
//            if(alphabet[i]==1){
//                System.out.println("First Non Repeating Character is : "+(char)(i+97));
//                return;
//            }
//        }

        for (int i=0; i<inputCharacterArray.length; i++){
            int index = (inputCharacterArray[i]) - 97;
            if (alphabet[index] == 1){
                System.out.println("First Character is : " + (char)(index+97));
                return;
            }
        }
    }
}
