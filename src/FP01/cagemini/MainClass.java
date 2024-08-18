package src.FP01.cagemini;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class EmployeeSorting implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getAge() != e2.getAge())
        return Integer.compare(e1.getAge(),e2.getAge());
        else return  Integer.compare(e1.getSalary(), e2.getSalary());
    }
}
public class MainClass {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Rahman",20,100));
        employeeList.add(new Employee("Margub",30,1000));
        employeeList.add(new Employee("Abc",15,1100));
        employeeList.add(new Employee("Def",15,1200));

//        Stream<Employee> sorted = employeeList.stream().sorted(new EmployeeSorting());
//
//        sorted.forEach(System.out::println);

//        employeeList.sort((e1,e2) -> Integer.compare(e1.getAge(),e2.getAge())  );
        employeeList.sort(Comparator.comparing(Employee::getAge).thenComparing(Employee::getSalary));
        employeeList.stream().forEach(System.out::println);
    }
}

