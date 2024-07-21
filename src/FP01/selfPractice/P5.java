package src.FP01.selfPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P5 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"Abc",2000));
        employeeList.add(new Employee(1,"Abc",1000));
        employeeList.add(new Employee(1,"Dbc",3000));
        employeeList.add(new Employee(1,"Abc",3000));
        employeeList.add(new Employee(1,"Abc",8000));

        Collections.sort(employeeList, new EmplyessSortingComparator());

        employeeList.stream().forEach(System.out::println);
    }
}
