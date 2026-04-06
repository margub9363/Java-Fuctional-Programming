package src.FP01.singletonClass;

public class Singleton {
    private Singleton() {
        System.out.println("Singleton construction called");
    }

    static  Singleton singleton = new Singleton();
    public static Singleton getObject(){
        return singleton;
    }
}

