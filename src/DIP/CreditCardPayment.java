package DIP;

public class CreditCardPayment implements PaymentProcessor {

    public void processPayment() {
        System.out.println("Processing credit card payment...");
    }

}
