package DIP;

public class PayPalPayment implements PaymentProcessor {

    public void processPayment() {
        System.out.println("Processing PayPal payment...");
    }

}
