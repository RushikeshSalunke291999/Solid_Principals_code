package OCP.Notification;

public enum notification {
    SMS,
    MAIL,
    WHATSAPP;

    public void sendSMSNotification(){
        System.out.println("SMS Notification");
    }

    public void sendMailNotification(){
        System.out.println("Mail Notification");
    }

    public void sendWhatsappNotification(){
        System.out.println("Whatsapp Notification");
    }
}
