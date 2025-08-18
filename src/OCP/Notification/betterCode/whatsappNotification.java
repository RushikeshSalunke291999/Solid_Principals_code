package OCP.Notification.betterCode;

import OCP.Notification.notification;

public class whatsappNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("whatsapp notification");
    }
}
