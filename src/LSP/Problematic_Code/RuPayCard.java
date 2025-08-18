package LSP.Problematic_Code;

public class RuPayCard extends creaditCard{
    @Override
    public void tapAndPay() {
        System.out.println("tapAndPay in RuPayCard");
    }

    @Override
    public void OnlineTransfer() {
        System.out.println("OnlineTransfer in RuPayCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("swipeAndPay in RuPayCard");
    }

    @Override
    public void mandatePayment() {
        System.out.println("mandatePayment in RuPayCard");
    }
}
