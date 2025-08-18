package OCP.Notification.betterCode;

public class mailNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("mail notification");
    }
}
