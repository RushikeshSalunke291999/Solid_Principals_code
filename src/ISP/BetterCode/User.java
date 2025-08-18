package ISP.BetterCode;

public class User implements ICanModifiy, ICanBuy{
    @Override
    public void canBuy() {
        System.out.println("can buy ");
    }

    @Override
    public void canModify() {
        System.out.println("can modify ");
    }
}
