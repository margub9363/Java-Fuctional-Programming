package src.FP01.wipro;

import java.util.*;
import java.util.stream.Collectors;

/*
given  -> [1,2,a,v,s,f,6,7,d,s,2,k,h,0]
output -> [1,2,6,7,2,0,a,v,s,f,d,s,k,h]
We have to code everything
 */
public class SplittingNumberAndCharacter_WithArrayList {
    public static void main(String[] args) {
        Object[] input = new Object[]{'b', 1, 2, 'a', 'v', 's', 'f', 6, 7, 'd', 's', 2, 'k', 'h', 0};

        List<Object> list = Arrays.asList(input);
        List<Character> characters = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        List<Object> output = new ArrayList<>();

        list.stream().forEach(obj -> {
            if (obj instanceof Integer) {
                numbers.add((int) obj);
            } else characters.add((char) obj);
        });
        output.addAll(numbers);
        output.addAll(characters);
        System.out.println(output);
    }
}
