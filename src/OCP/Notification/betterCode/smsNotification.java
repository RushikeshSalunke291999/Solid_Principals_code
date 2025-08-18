package OCP.Notification.betterCode;

public class smsNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("sms notification");
    }
}
