package creational.singleton.before;

public class Main {

    public static void main(String[] args) {
        Logger logger = new Logger();
        logger = new Logger();
        logger.writeLogs();
    }
}
