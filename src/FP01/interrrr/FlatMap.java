package src.FP01.interrrr;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class
FlatMap {

    public static void main(String[] args) {

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Learning", "For"),
                Arrays.asList("Developers", "A computer portal"),
                Arrays.asList("Java", "Programming")
        );

        listOfLists.stream().flatMap(Collection::stream).forEach(t -> System.out.println(t));
    }

}


