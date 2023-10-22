package src.FP01.test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortingStringUsingComparator {
    public static void main(String[] args) {
        List<String > courses = List.of("Spring", "Spring Boot", "API", "Microservices","AWS","PCF","AZURE","Docker","Kubernetes");
//        sortingCourses(courses);
//        reverseSortingTheCourses(courses);
        compairingWithTheLengthOfTheString(courses);
    }

    private static void compairingWithTheLengthOfTheString(List<String> courses) {
        courses.stream().sorted(Comparator.comparing(s -> s.length())).forEach(System.out::println);
    }

    private static void reverseSortingTheCourses(List<String> courses) {
        courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    private static void sortingCourses(List<String> courses) {
        Stream<String> sortedInput = courses.stream().sorted(Comparator.naturalOrder()); // this is called natural sorting
        sortedInput.forEach(System.out::println);
    }
}
