package LSP.Better_Code;

public class RuPayCard extends creaditCard implements UPIPaymentCompatiableCards {
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

    @Override
    public void UPIPayment() {
        System.out.println("UPIPayment in RuPayCard");
    }
}
