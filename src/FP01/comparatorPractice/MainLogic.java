package src.FP01.comparatorPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainLogic {
    public static void main(String[] args) {
        List<Emp> employeeList = new ArrayList<>();
        employeeList.add(new Emp(1,"AA",1000));
        employeeList.add(new Emp(2,"Ba",3000));
        employeeList.add(new Emp(3,"DA",5000));
        employeeList.add(new Emp(4,"CA",5000));
        employeeList.add(new Emp(5,"AA",1000));

        Collections.sort(employeeList,new EmpSalaryAndNameComparator());

        System.out.println(employeeList);

    }
}
