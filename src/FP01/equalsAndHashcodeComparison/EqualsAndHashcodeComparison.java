package src.FP01.equalsAndHashcodeComparison;

class Employee {
    private String name;
    private String email;
    private long number;

    public Employee(String name, String email, long number) {
        this.name = name;
        this.email = email;
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same reference

        if (obj == null || getClass() != obj.getClass()) return false;

        Employee other = (Employee) obj;

        return number == other.number &&
                java.util.Objects.equals(name, other.name) &&
                java.util.Objects.equals(email, other.email);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

public class EqualsAndHashcodeComparison {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rahman", "rahman@gmial.com", 903179030);
        Employee e2 = new Employee("Rahman", "rahman@gmial.com", 903179030);
        if (e1.equals(e2)) {
            System.out.println("Objects are Equal");
        } else System.out.println("Objects are Un-Equal");
        System.out.println();

        System.out.println("--------------Comparing HashCode----------");
        if (e1.hashCode() == e2.hashCode()) {

        } else System.out.println("Hashcodes are un equal");

    }
}
