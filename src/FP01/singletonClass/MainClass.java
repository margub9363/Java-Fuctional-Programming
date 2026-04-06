package src.FP01.singletonClass;

public class MainClass {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getObject();
        Singleton singleton2 = Singleton.getObject();
    }
}
