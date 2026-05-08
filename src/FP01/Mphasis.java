package src.FP01;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//Inputs -> "test123" 't'
//Output -> es123tt
//Approach 1
/*
public class Mphasis {
    public static void main(String[] args) {
        String inputString = "test123";
        char inputChar = 't';

        int originalLengthOftheString = inputString.length();
        inputString = inputString.replace(String.valueOf(inputChar), "");
        System.out.print(inputString);
        for (int i = inputString.length()-1; i < originalLengthOftheString-1; i++) {
            System.out.print("t");
        }

    }
}
*/
  //Apprach 2

public class Mphasis {
    public static void main(String[] args) {
        String inputString = "test123";
        char inputChar = 't';
        List<Character> ccc = new ArrayList<>();

        List<Character> collect = inputString.chars().mapToObj(c -> (char) c).filter(c -> {
            if (c == inputChar) {
                ccc.add(c);
            }
            return c != inputChar;
        }).collect(Collectors.toList());

        collect.addAll(ccc);

        String collect1 = collect.stream().map(c -> new String(String.valueOf(c))).collect(Collectors.joining());
        System.out.println(collect1);
    }
}
