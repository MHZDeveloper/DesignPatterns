package creational.factory.after;

import creational.factory.EmailNotification;
import creational.factory.Notification;
import creational.factory.SMSNotification;

public class NotificationFactory {

    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty())
            throw new IllegalArgumentException("unknown channel");
        switch (channel) {
            case "EMAIL":
                return new EmailNotification();
            case "SMS":
                return new SMSNotification();
            default:
                throw new IllegalArgumentException("unknown channel");
        }
    }
}
