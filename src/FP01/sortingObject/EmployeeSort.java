package src.FP01.sortingObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}

class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int salaryComparison = Double.compare(e1.getSalary(), e2.getSalary());
        if (salaryComparison != 0) {
            return salaryComparison;
        } else {
            return e1.getName().compareTo(e2.getName());
        }
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 50000));
        employees.add(new Employee("Bob", 70000));
        employees.add(new Employee("Charlie", 50000));
        employees.add(new Employee("David", 60000));
        employees.add(new Employee("Eve", 70000));

        Collections.sort(employees, new EmployeeComparator());

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
