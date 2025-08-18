package OCP.Notification.betterCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Notification> notifications = new ArrayList<Notification>();
        notifications.add(new smsNotification());
        for(Notification notification : notifications) {
            notification.sendNotification();
        }
    }
}
