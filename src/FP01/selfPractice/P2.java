package src.FP01.selfPractice;

import src.FP01.practice2.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P2 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Rahman", "27"));
        employeeList.add(new Employee("Rahman", "27"));
        employeeList.add(new Employee("Rahman", "27"));
        employeeList.add(new Employee("Rahman", "20"));
        employeeList.add(new Employee("Rahman", "27"));
        employeeList.add(new Employee("Margub", "27"));
        employeeList.add(new Employee("Margub", "27"));
        employeeList.add(new Employee("Margub", "27"));
        employeeList.add(new Employee("Margub", "28"));
        employeeList.add(new Employee("Margub", "27"));

        Map<Integer,Employee> distinctEmployees = new HashMap<>();
//        for(Employee e: employeeList) {
//            distinctEmployees = filterDistinct(e,distinctEmployees);
//        }
//        System.out.println(distinctEmployees);
employeeList.stream().distinct().forEach(System.out::println);

    }
    private static  Map<Integer,Employee> filterDistinct(Employee e,Map<Integer,Employee> distinctEmployees) {
        distinctEmployees.put(e.hashCode(),e);
        return distinctEmployees;
    }
}
