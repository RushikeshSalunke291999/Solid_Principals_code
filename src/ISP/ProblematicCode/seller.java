package ISP.ProblematicCode;

public class seller implements User{

    @Override
    public Boolean canUploadProduct() {
        return null;
    }

    @Override
    public Boolean canBuyProduct() {
        return null;
    }

    @Override
    public Boolean canAddProduct() {
        return null;
    }

    @Override
    public Boolean canRemoveProduct() {
        return null;
    }

    /*
    th following code is forcefully we have to be Implemented here or we have to throws error or exception
    because it will violating ISP Interface Segregation principal
     */

//    @Override
//    public Boolean canAddProduct() {
//        return null;
//    }
//
//    @Override
//    public Boolean canRemoveProduct() {
//        return null;
//    }
}
