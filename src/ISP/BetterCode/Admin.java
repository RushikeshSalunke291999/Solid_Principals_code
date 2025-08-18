package ISP.BetterCode;

public class Admin implements  ICanSell, ICanApprove,ICanBuy,ICanModifiy {
    @Override
    public void canApprove() {
        System.out.println("can approve ");
    }

    @Override
    public void canBuy() {
        System.out.println("can buy ");
    }

    @Override
    public void canModify() {
        System.out.println("can modify ");
    }

    @Override
    public void canSell() {
        System.out.println("can sell ");
    }
}
