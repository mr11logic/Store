package payment;
import java.util.ArrayList;
public class PremiumCustomer extends Customer {
    public PremiumCustomer(String name){
        super(name);
        this.paymentHistory = new ArrayList<>();
    }
    @Override
    public void displayCustomerInfo(){
        System.out.println(name + "is Premium customer");
    }
}
