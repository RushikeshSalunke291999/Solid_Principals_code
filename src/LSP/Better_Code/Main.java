package LSP.Better_Code;


import java.util.ArrayList;
import java.util.List;

/*
this code reefers one of the solid principal
LSP (Liskov Substitution principal)
- LSP states that objects of a superclass should be replaceable with objects of its subclass
without altering the correctness, behavior, or expected properties of the program
*/

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.PaymentsINCards();
    }

    public void PaymentsINCards(){
        List<InternationalPaymantCompatiableCards> c = new ArrayList<>();
        c.add(new MasterCard());
        c.add(new VisaCard());
        for (InternationalPaymantCompatiableCards card : c) {
            card.InternationalPayment();
        }
    }
}
