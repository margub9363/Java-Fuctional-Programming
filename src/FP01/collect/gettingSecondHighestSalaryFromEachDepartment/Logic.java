package src.FP01.collect.gettingSecondHighestSalaryFromEachDepartment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Logic {

    public static void main(String[] args) {

        Employee a = new Employee("a", "mechanical", 1000);
        Employee b = new Employee("b", "civil", 2000);
        Employee c = new Employee("c", "electrical", 3000);
        Employee d = new Employee("d", "cs", 4000);
        Employee e = new Employee("e", "it", 5000);
        Employee f = new Employee("f", "mechanical", 6000);
        Employee g = new Employee("g", "mechanical", 7000);
        Employee h = new Employee("h", "electrical", 8000);
        Employee i = new Employee("i", "mechanical", 9000);
        Employee j = new Employee("j", "cs", 10000);
        Employee k = new Employee("k", "it", 11000);
        Employee l = new Employee("l", "aviation", 12000);

        ArrayList<Employee> listOfEmployees = new ArrayList<>();
        listOfEmployees.add(a);
        listOfEmployees.add(b);
        listOfEmployees.add(c);
        listOfEmployees.add(d);
        listOfEmployees.add(e);
        listOfEmployees.add(f);
        listOfEmployees.add(g);
        listOfEmployees.add(h);
        listOfEmployees.add(i);
        listOfEmployees.add(j);
        listOfEmployees.add(k);
        listOfEmployees.add(l);
        listOfEmployees.add(l);

        Map<String, List<Employee>> collect = listOfEmployees.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment()));
        System.out.println(collect);
        Map<String, List<String>>  employeeDepartmentToNameMap = listOfEmployees.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment(), Collectors.mapping(emp -> emp.getName(), Collectors.toList())));
        System.out.println(employeeDepartmentToNameMap);
        Map<String, List<Integer>> employeeSalaryDepartmentWise = listOfEmployees.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment(), Collectors.mapping(emp -> emp.getSalary(), Collectors.toList())));
        System.out.println(employeeSalaryDepartmentWise);
    }
}
