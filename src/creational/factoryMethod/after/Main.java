package creational.factoryMethod.after;

import creational.factoryMethod.EmailNotification;
import creational.factoryMethod.Notification;
import creational.factoryMethod.SMSNotification;

public class Main {

    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("EMAIL");
        notification.notifyUser();
        notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}
