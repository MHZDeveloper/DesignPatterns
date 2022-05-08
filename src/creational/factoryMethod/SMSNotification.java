package creational.factoryMethod;

public class SMSNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("this is an sms notification");
    }
}
