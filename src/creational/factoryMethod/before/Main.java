package creational.factoryMethod.before;

import creational.factoryMethod.EmailNotification;
import creational.factoryMethod.Notification;
import creational.factoryMethod.SMSNotification;

public class Main {

    public static void main(String[] args) {
        Notification notification = new EmailNotification();
        notification.notifyUser();
        notification = new SMSNotification();
        notification.notifyUser();
    }
}
