package payment;

public class PayPalPayment implements PaymentStrategy {
    String email;
    public PayPalPayment(String email) {
        this.email = email;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
    @Override
    public String getPaymentDetails() {
        return "Payment details = " + "PayPal Account: "+ email + " , < using PayPal. >";
    }
}



