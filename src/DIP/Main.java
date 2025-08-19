package DIP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<CreditCardPayment> orderServiceList = new ArrayList<>();
        orderServiceList.add(new CreditCardPayment());
        for (CreditCardPayment creditCardPayment : orderServiceList) {
            creditCardPayment.processPayment();
        }
    }
}
