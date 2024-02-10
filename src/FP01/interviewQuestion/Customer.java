package src.FP01.interviewQuestion;

public class Customer {
    private String customerName;
    private String city;
    private double purchaseAmount;


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(int purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public Customer(String customerName, String city, int purchaseAmount) {
        this.customerName = customerName;
        this.city = city;
        this.purchaseAmount = purchaseAmount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", city='" + city + '\'' +
                ", purchaseAmount=" + purchaseAmount +
                '}';
    }
}
