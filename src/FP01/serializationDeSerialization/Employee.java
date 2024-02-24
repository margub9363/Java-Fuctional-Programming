package src.FP01.serializationDeSerialization;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = -2108716419279146543L;
    private String name;
    private String address;

    public Employee(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
