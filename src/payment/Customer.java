package payment;
import java.util.ArrayList;
public abstract class Customer {
    public String name;
    public ArrayList<String> paymentHistory;
    public Customer(String name) {
        this.name = name;
        this.paymentHistory = new ArrayList<>();
    }
    public abstract void displayCustomerInfo();
    public void makePayment(PaymentStrategy paymentStrategy, double amount){
        paymentStrategy.pay(amount);
        paymentHistory.add(paymentStrategy.getPaymentDetails() + amount);
    }
    public void showPaymentHistory (){
        for (String p : paymentHistory) {
            System.out.println(p);
        }
    }
}
