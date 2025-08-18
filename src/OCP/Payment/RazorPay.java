// Java
package OCP.Payment;

public class RazorPay implements payment {
    @Override
    public void payProcess() {
        System.out.println("Processing RazorPay payment");
    }
}