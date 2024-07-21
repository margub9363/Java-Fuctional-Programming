package src.FP01.palindrome;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewPrep {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"aaa",10));
        students.add(new Student(1,"bbb",50));
        students.add(new Student(1,"ccc",60));
        students.add(new Student(1,"ddd",60));
        students.add(new Student(1,"eee",65));
        students.add(new Student(1,"fff",62));
        students.add(new Student(1,"abd",10));


//    find distinct by marks using stream api only
        List<String> collect = students.stream().filter(st-> st.getMarks()>60).map(student -> student.getName()).collect(Collectors.toList());
        System.out.println(collect);


    }

}
