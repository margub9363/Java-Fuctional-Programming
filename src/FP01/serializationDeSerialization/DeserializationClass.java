package src.FP01.serializationDeSerialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationClass {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee emp = null;
        FileInputStream fileIn = new FileInputStream("src/FP01/serializationDeSerialization/Char.txt");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        emp = (Employee) in.readObject();
        in.close();
        fileIn.close();

        System.out.println("Deserializing Object");
        System.out.println("First Name of Employee :"+ emp.getName());
        System.out.println("Empoyee Address : "+emp.getAddress());

    }
}
