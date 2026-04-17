package src.FP01.altimetrik;

import java.util.*;

class Employee {
    private String name;
    private int id;
    private double sal;

    public Employee( int id, String name,double sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", sal=" + sal +
                '}';
    }
}
public class SortingEmployee {
    public static void main(String[] args) {

        List<Employee> empList =new ArrayList<>();
        empList.add(new Employee(111,"sree",1000));
        empList.add(new Employee(222,"Raj",900));
        empList.add(new Employee(333,"ram",700));
        empList.add(new Employee(444,"Raj",1700));
        empList.add(new Employee(555,"Raj",900));

        empList.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSal)).forEach(System.out::println);

    }
}


/*
What are the Parameters @Feign?

How to Integrate Keycloak with Spring Boot and Spring Security?

What is sociallogin?

How you can find the height of the binary tree?
  */