package LSP.Problematic_Code;

public abstract class creaditCard {

    private String ccNumber;
    private String ownerName;
    private String cardHolderName;
    private String cardNumber;
    private String expirationDate;
    private String CVV;

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public abstract void tapAndPay();

    public abstract void OnlineTransfer();

    public abstract void swipeAndPay();

    public abstract void mandatePayment();
}
