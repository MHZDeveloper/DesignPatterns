package creational.factoryMethod;

public class EmailNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("this is an email notification");
    }
}
