import payment.*;

public class Main {
    public static void main(String[] args) {
        RegularCustomer regKambiz = new RegularCustomer("Kambiz");
        RegularCustomer regKamran = new RegularCustomer("Kamran");
        PremiumCustomer preKarim = new PremiumCustomer("Karim");

        CreditCardPayment payRegKambiz = new CreditCardPayment("025" , "Kambiz");
        PayPalPayment payRegKamran = new PayPalPayment("Kamran@gmail.com");
        BitcoinPayment payPreKarim = new BitcoinPayment("13851385");
        System.out.println("Info Customer:");
        regKambiz.displayCustomerInfo();
        regKamran.displayCustomerInfo();
        preKarim.displayCustomerInfo();

        System.out.println();

        System.out.println("Payments: ");
        System.out.println("Kambiz's payments : ");
        regKambiz.makePayment( payRegKambiz, 150);
        regKambiz.makePayment( payRegKambiz, 200);
        System.out.println("Kamran's payments");
        regKamran.makePayment( payRegKamran, 700);
        regKamran.makePayment( payRegKamran, 165);
        System.out.println("Karim's payments");
        preKarim.makePayment( payPreKarim, 987);
        preKarim.makePayment( payPreKarim, 444);
        System.out.println();
        System.out.println("Payments History : ");
        regKambiz.showPaymentHistory();
        System.out.println();
        regKamran.showPaymentHistory();
        System.out.println();
        preKarim.showPaymentHistory();
    }
}
