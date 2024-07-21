package src.FP01.selfPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Fruit{
    int price;
    String name;

    @Override
    public String toString() {
        return "Fruit{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    public Fruit(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class P6 {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit(700,"apple"));
        fruits.add(new Fruit(3200,"grapes"));
        fruits.add(new Fruit(100,"guava"));
        fruits.add(new Fruit(800,"banana"));

        Map<Integer,Fruit> sortedWithPrice = new TreeMap<>();

        fruits.stream().forEach(f -> sortedWithPrice.put(f.getPrice(),f));
        System.out.println(sortedWithPrice);
    }
}
