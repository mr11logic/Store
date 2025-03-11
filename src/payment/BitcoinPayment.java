package payment;

public class BitcoinPayment implements PaymentStrategy{
    String walletAddress;
    public BitcoinPayment(String walletAddress){
        this.walletAddress = walletAddress;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Bitcoin");
    }
    @Override
    public String getPaymentDetails() {
        return "Payment details = " + "Bitcoin Wallet Address: " + walletAddress + " , < using Bitcoin. >";
    }
}
