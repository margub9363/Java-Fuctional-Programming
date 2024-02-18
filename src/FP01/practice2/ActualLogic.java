package src.FP01.practice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Write a logic to filter out the distict record from employee Object
public class ActualLogic {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Rahman","27"));
        employeeList.add(new Employee("Rahman","27"));
        employeeList.add(new Employee("Rahman","27"));
        employeeList.add(new Employee("Rahman","20"));
        employeeList.add(new Employee("Rahman","27"));
        employeeList.add(new Employee("Margub","27"));
        employeeList.add(new Employee("Margub","27"));
        employeeList.add(new Employee("Margub","27"));
        employeeList.add(new Employee("Margub","28"));
        employeeList.add(new Employee("Margub","27"));

        Map<Integer ,Employee> distictEmpployees = new HashMap<>();
        for (int i = 0; i < employeeList.size(); i++) {
            distictEmpployees.put(employeeList.get(i).hashCode(),employeeList.get(i));
        }
        System.out.println(distictEmpployees);
    }
}


