// Java
package OCP.Payment;

public class Paypal implements payment {
    @Override
    public void payProcess() {
        System.out.println("Processing PayPal payment");
    }
}