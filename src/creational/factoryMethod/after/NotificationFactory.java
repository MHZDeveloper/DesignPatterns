package creational.factoryMethod.after;

import creational.factoryMethod.EmailNotification;
import creational.factoryMethod.Notification;
import creational.factoryMethod.SMSNotification;

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
