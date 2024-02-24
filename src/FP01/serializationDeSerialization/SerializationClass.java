package src.FP01.serializationDeSerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationClass {
    public static void main(String[] args) throws IOException {

        Employee e = new Employee("Tannu","Ranchi");

        FileOutputStream fileOut = new FileOutputStream("src/FP01/serializationDeSerialization/Char.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(e);
        out.close();
        fileOut.close();
        System.out.println("Serialization Data is Saved in Char.txt file");

    }
}
