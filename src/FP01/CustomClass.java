package src.FP01;


import java.util.List;

class Course{
    private String name;
    private String category;
    private int reviewScore;
    private int noOfStudent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudent() {
        return noOfStudent;
    }

    public void setNoOfStudent(int noOfStudent) {
        this.noOfStudent = noOfStudent;
    }

    public Course(String name, String category, int reviewScore, int noOfStudent) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudent = noOfStudent;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", reviewScore=" + reviewScore +
                ", noOfStudent=" + noOfStudent +
                '}';
    }
}

public class CustomClass {
    public static void main(String[] args) {

        List<Course> courses = List.of(
                new Course("Spring", "Framework", 98, 2000),
                new Course("Spring Boot", "Framework", 95, 2000),
                new Course("API", "Framework", 94, 2000),
                new Course("Microservices", "Framework", 93, 2000),
                new Course("FullStack", "Framework", 92, 2000),
                new Course("AWS", "Framework", 91, 2000),
                new Course("Azure", "Framework", 90, 2000),
                new Course("Docker", "Framework", 89, 2000),
                new Course("Kubernetes", "Framework", 88, 2000)
        );

//        AllMatch
//        this is going to return true if all of the review score is greater than 95
        System.out.println(courses.stream().allMatch(course -> course.getReviewScore()>95));
//        o/p -> false


//        AnyMatch
//        this is going to return true if any of the review score is greater than 95
        System.out.println(courses.stream().anyMatch(course -> course.getReviewScore()>95));
//        o/p -> true


//        nonMatch
//        This is going to return true if non of them meet the criteria
        System.out.println(courses.stream().noneMatch(x -> x.getReviewScore()<88));
//        o/p -> true
    }
}
