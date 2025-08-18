package LSP.Better_Code;

public class VisaCard extends creaditCard implements InternationalPaymantCompatiableCards {
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
        System.out.println("swipeAndPay in VisaCard");
    }

    @Override
    public void mandatePayment() {
        System.out.println("mandatePayment in VisaCard");
    }

    @Override
    public void InternationalPayment() {
        System.out.println("InternationalPayment in VisaCard");
    }
}
