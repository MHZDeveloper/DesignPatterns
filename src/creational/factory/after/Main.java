package creational.factory.after;

import creational.factory.Notification;

public class Main {

    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("EMAIL");
        notification.notifyUser();
        notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}
