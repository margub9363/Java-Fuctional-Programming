package src.FP01.practice2;

public class RemoveEmptySpacesFromString {
    /*public static void main(String[] args) {
        String str = "how was your day";
        String result = str.replaceFirst(" ","");
//        String result = str.replaceAll(" ", "");
        System.out.println(result);
    }*/

    // by logic
    public static void main(String[] args) {
        char[] charArray = "how was your day".toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                for (int j = i; j <charArray.length; j++) {
                    if(j<charArray.length-1) {
                        charArray[j]= charArray[j+1];
                    }
                }
            }
        }
        System.out.println(new String(charArray));
    }

}
