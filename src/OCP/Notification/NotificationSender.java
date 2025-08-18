package OCP.Notification;

import java.util.List;

public class NotificationSender {

    public void sendNotification(List<notification> list){
        for(notification type:list){
            if(type == notification.SMS){
                type.sendSMSNotification();
            } else if (type == notification.MAIL) {
                type.sendMailNotification();
            }else if (type == notification.WHATSAPP) {
                type.sendWhatsappNotification();
            }else{
                System.out.println("there is no notification");
            }

        }

    }

    public void sendNotifications() {

    }
}
