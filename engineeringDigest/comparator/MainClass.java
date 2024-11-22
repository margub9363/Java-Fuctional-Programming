package engineeringDigest.comparator;

import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("aaa3", "bbbb4", "ccccc5","e1","kkkkkk6");

        fruits.sort(null); /* <<-- This is natural order sorting.
        Null is working here because for Strings we have a method to compare. I
        If we would have been dealing with some class like student it would have not worked here */
//        fruits.sort( (a,b) -> a.length() - b.length());
        fruits.sort( (a,b) -> b.length() - a.length()); // We are sorting in descending order.
//        Actually here, through lambda expression we are overwriding the compare method of comparator interface
        System.out.println(fruits);


    }
}
