package src.FP01;

import java.util.List;

public class Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 3, 54, 532, 23, 23, 45, 23);
//        printAllNumbersInListFunctional(numbers);
//        printEvenNumber(numbers);
//        printSquareOfEvenNumbers(numbers);

        List<String > courses = List.of("Spring", "Spring Boot", "API", "Microservices","AWS","PCF","AZURE","Docker","Kubernetes");
//        toPrintAllTheCourses(courses);
        printCoursesContainingWordString(courses);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers){
        numbers.stream().forEach(System.out::println);
    }

    private static void printEvenNumber(List<Integer> numbers) {
        numbers.stream().filter(number -> number%2==0).forEach(toPrinnt -> System.out.println(toPrinnt));
    }

    private static void printSquareOfEvenNumbers(List<Integer> input) {
        input.stream().filter(i -> i%2 ==0).forEach(i -> System.out.println(i*i));
    }

//    to print all course individually
    private static void toPrintAllTheCourses(List<String > inputList){
        inputList.stream().forEach(i-> System.out.println(i));
    }

//print courses containing word String
    private static void printCoursesContainingWordString(List<String > inputList) {
        inputList.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
    }
}
