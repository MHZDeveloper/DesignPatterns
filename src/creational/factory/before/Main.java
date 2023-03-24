package creational.factory.before;

import creational.factory.EmailNotification;
import creational.factory.Notification;
import creational.factory.SMSNotification;
import creational.factory.after.NotificationFactory;

public class Main {

    public static void main(String[] args) {
        Notification notification = new EmailNotification();
        notification.notifyUser();
        notification = new SMSNotification();
        notification.notifyUser();
    }
}
