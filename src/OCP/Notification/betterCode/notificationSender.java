package OCP.Notification.betterCode;

import java.util.List;

public class notificationSender {

    public void sendNotifications(List<Notification> notifications) {
        for(Notification type:notifications){
            type.sendNotification();
        }
    }
}
