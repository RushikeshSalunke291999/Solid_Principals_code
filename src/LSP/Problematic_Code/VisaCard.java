package LSP.Problematic_Code;

public class VisaCard extends creaditCard{
    @Override
    public void tapAndPay() {
        System.out.println("tapAndPay in VisaCard");
    }

    @Override
    public void OnlineTransfer() {
        System.out.println("OnlineTransfer in VisaCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("swipeAndPay in RuPayCard");
    }

    @Override
    public void mandatePayment() {
        System.out.println("mandatePayment in VisaCard");
    }
}
