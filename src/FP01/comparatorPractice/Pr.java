package src.FP01.comparatorPractice;

class Employee {
    private Employee() {}

    public static final Employee INSTANCE = new Employee();

    static Employee getInstance() {
        System.out.println("************");
        return INSTANCE;
    }
}

public class Pr {
    public static void main(String[] args) {
        Employee.getInstance();
    }
}
