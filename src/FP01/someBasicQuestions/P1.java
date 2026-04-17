package src.FP01.test;


import src.FP01.comparatorPractice.Emp;

import java.util.*;


class Employee {
    private int id;
    private String firstName;
    private String lastName;

    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

public class P1 {

    public static void main(String[] args) {


//        for stroing the data
        Map<Integer, Employee>  employeeMapRecords = new HashMap<>();
        insertEmployeeRecord(employeeMapRecords,1,"Margub","Rahman");

        System.out.println("Enter 3 Records");
        int id =0;
        String firstN = "";
        String lastN = "";
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<3; i++) {
            System.out.println("Enter Id : ");
            id = scanner.nextInt();
            System.out.println("Enter First Name :");
            firstN = scanner.next();
            System.out.println("Enter Last Name : ");
            lastN = scanner.next();
            insertEmployeeRecord(employeeMapRecords, id,firstN,lastN);
        };

//        displaying Data
        System.out.println("Enter the id for which you want to see the Details");
        id = scanner.nextInt();
        retrieveSpecificRecoerd(employeeMapRecords,id);
    }

    private static void insertEmployeeRecord( Map<Integer, Employee>  employeeMapRecods, int id,String firstName,String lastName) {
       employeeMapRecods.put(id, new Employee(id,firstName,lastName));
    }

    private static void retrieveSpecificRecoerd( Map<Integer, Employee>  employeeMapRecods, int id) {
        Employee employee = employeeMapRecods.get(id);
        System.out.println("Employee Details "+employee.toString());
    }
    
    


}
