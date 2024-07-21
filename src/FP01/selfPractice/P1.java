package src.FP01.selfPractice;

//        Display all the customer Details whose name starts with R
//        Display the count of the customers for each city
//    Dive 10% discount to the peolpe whose purchase is greater than 1000


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P1 {
    public static void main(String[] args) {

        Customer c1 = new Customer(1,"A",1000,"Ranchi");
        Customer c2 = new Customer(2,"Ra",3000,"Bangalore");
        Customer c3 = new Customer(3,"A",900,"Bangalore");
        Customer c4 = new Customer(4,"Rb",10000,"Kara");

        List<Customer> custoemrLsit = new ArrayList<>();
        custoemrLsit.add(c1);
        custoemrLsit.add(c2);
        custoemrLsit.add(c3);
        custoemrLsit.add(c4);

        custoemrLsit.stream().filter(x -> x.getName().startsWith("R")).forEach(x-> System.out.println(x));
        System.out.println("*************");

        Map<String,Integer> cityCount = new HashMap<>();
//        custoemrLsit.stream().forEach(c -> cityCount = logic(c,cityCount));
        for(Customer c:custoemrLsit){
            cityCount = logic(c,cityCount);
        }
        System.out.println(cityCount);

        System.out.println(("@@@@@@@@@@@@@@@@@@@@@@@@@@"));
        custoemrLsit.stream().map(c->{
            if(c.getAmount()>1000) c.setAmount((float) (c.getAmount()*0.90));
            return c;
        }).forEach(c -> System.out.println(c));

    }
    public static Map<String,Integer> logic(Customer c, Map<String,Integer> cityCount) {
        if(cityCount.get(c.getCity())!=null) {
            int currentCount = cityCount.get(c.getCity());
            cityCount.put(c.getCity(),currentCount+1);
        }else cityCount.put(c.getCity(),1);
        return cityCount;
    }
}


class Customer {
    private int id;
    private String name;
    private float amount;
    private String city;

    public Customer(int id, String name, int amount, String city) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", city='" + city + '\'' +
                '}';
    }
}