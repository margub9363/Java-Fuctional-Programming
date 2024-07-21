package src.FP01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//list of integer 1000 2000 3000 40000 50000 2000


public class Test2 {
    public static void main(String[] args) {
        List<Integer> salaryList = new ArrayList<>();
//        salaryList.add(1000);

        List<Integer> sortedList = salaryList.stream().sorted().collect(Collectors.toList());
        System.out.println("Second Highest Salary : " + sortedList.get(sortedList.size()-2));

    }
}
