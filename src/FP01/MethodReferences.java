package src.FP01;

import java.util.List;

public class MethodReferences {

    private static void print(String str) {
        System.out.println(str);
    }

    public MethodReferences(String str) {
        System.out.println("Constructor call , new object will be created with String = "+ str);

    }

    public static void main(String[] args) {
        List<String > courses = List.of("Spring", "Spring Boot", "API", "Microservices","AWS","PCF","AZURE","Docker","Kubernetes");

        courses.stream().forEach(System.out::println);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        courses.stream().forEach(MethodReferences::print);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        courses.forEach(MethodReferences::new);
    }
}
