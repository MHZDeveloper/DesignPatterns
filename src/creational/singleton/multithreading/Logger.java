package creational.singleton.multithreading;

public class Logger {

    private static Logger logger;

    private Logger() {
        System.out.println("initializing logger");
    }

    public synchronized static Logger getInstance() {
        if (logger == null)
            logger = new Logger();
        return logger;
    }

    public void writeLogs() {
        System.out.println("writing logs");
    }
}
