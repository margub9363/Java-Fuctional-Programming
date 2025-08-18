package src.FP01.interviewQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Logic {
    public static void main(String[] args) {
        System.out.println("Lets Start");

//        Enter the customer details in collection
        List<Customer> customerdata = new ArrayList<Customer>();
        customerdata.add(new Customer("Rahman", "Ranchi", 1000));
        customerdata.add(new Customer("Tannu", "Ranchi", 8000));
        customerdata.add(new Customer("Margub", "kaara", 700));
        customerdata.add(new Customer("Rocky", "Bangalore", 4000));
        customerdata.add(new Customer("Abc", "Pondy", 900));
/*
//        Display all the customer Details whose name starts with R
        customerdata.stream().filter(c -> c.getCustomerName().startsWith("R")).forEach(System.out::println);

//        Display the count of the customers for each city
        HashMap<String, Integer> customerCityCount = new HashMap<String, Integer>();
        customerdata.stream().forEach(customer -> {
            if (customerCityCount.containsKey(customer.getCity())) {
                customerCityCount.replace(customer.getCity(), customerCityCount.get(customer.getCity()) + 1);
            } else customerCityCount.put(customer.getCity(), 1);
        });
        System.out.println("Cusotmer city count");
        System.out.println(customerCityCount);

//    Dive 10% discount to the peolpe whose purchase is greater than 1000
        customerdata.stream().forEach(c ->
                {
                    if (c.getPurchaseAmount()>1000) {
                        System.out.println("Purchase amount after discount for Customer "+ c.getCustomerName() +" is : "+c.getPurchaseAmount()*0.9);
                    }
                    else System.out.println("Purchase amount after discount for Customer "+ c.getCustomerName() +" is : "+c.getPurchaseAmount());
                }
                );*/

        Map<String, Long> cityCountMap = customerdata.stream()
                .collect(Collectors.groupingBy(Customer::getCity, Collectors.counting()));

        cityCountMap.forEach((city, count) -> System.out.println(city + " -> " + count));
    }
}

