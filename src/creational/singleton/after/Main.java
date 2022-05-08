package creational.singleton.after;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger = Logger.getInstance();
        logger.writeLogs();
    }
}
