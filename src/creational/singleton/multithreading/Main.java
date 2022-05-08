package creational.singleton.multithreading;

public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread(Logger::getInstance);
        Thread t2 = new Thread(Logger::getInstance);

        t1.start();
        t2.start();
    }
}
