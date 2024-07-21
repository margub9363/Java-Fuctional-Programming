package src.FP01.comparatorPractice;

import java.util.Comparator;

public class EmpSalaryAndNameComparator implements Comparator<Emp> {


    @Override
    public int compare(Emp o1, Emp o2) {
        int salaryComparison = Integer.compare(o1.getSalary(),o2.getSalary());
        if (salaryComparison != 0) return salaryComparison;
        else return o1.getName().compareTo(o2.getName());
    }
}
