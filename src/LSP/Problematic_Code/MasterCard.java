package LSP.Problematic_Code;

public class MasterCard extends creaditCard{
    @Override
    public void tapAndPay() {
        System.out.println("tapAndPay in MasterCard");
    }

    @Override
    public void OnlineTransfer() {
        System.out.println("OnlineTransfer in MasterCard");
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
