package src.FP01.selfPractice;

import java.util.Comparator;

public class EmplyessSortingComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int salaryComparison = Integer.compare(o1.getSalary(), o2.salary);
        if(salaryComparison!=0){
            return salaryComparison;
        } else return  o1.getName().compareTo(o2.getName());

    }
}
