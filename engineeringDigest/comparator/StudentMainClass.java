package engineeringDigest.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentMainClass {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Charlie",3.5));
        studentList.add(new Student("Bob",3.7));
        studentList.add(new Student("Alice",3.5));
        studentList.add(new Student("Akshit",3.9));

        /*
        studentList.sort((o1, o2) -> {
            if( o1.getGpa() > o2.getGpa()) return -1;
            else if (o1.getGpa() < o2.getGpa()) return 1;
            else return o2.getName().compareTo(o1.getName());
        } );
        System.out.println(studentList);
         */
        Comparator<Student> comparing = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        studentList.sort(comparing);
        System.out.println(studentList);
    }
}
