package OCP.Payment;
/*
This is a Second principal
      Open /Clos Princicpal
      class has always open to extension but closed for Modification
 */
public class Main {

    payment payments;

    public Main(payment payments) {
        this.payments = payments;
    }

    public static void main(String[] args) {
        PaymentFactory factory = new PaymentFactory();
        PaymentProcessor processor = new PaymentProcessor();

        // Choose payment method from args or environment/config
        String requested = (args != null && args.length > 0) ? args[0] : null;

        factory.createByName(requested).ifPresentOrElse(
            processor::process,
            () -> {
                System.out.println("Unknown or missing payment method. Available: " + factory.availableMethods());
            }
        );
    }
}
