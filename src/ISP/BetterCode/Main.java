package ISP.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Admin> buyers = new ArrayList<>();
        buyers.add(new Admin());
        for(Admin c : buyers) {
            c.canBuy();
            c.canSell();
            c.canApprove();
            c.canModify();
        }


        List<User> users = new ArrayList<>();
        users.add(new User());
        for(User u : users) {
            u.canBuy();
            u.canModify();
        }
    }
}