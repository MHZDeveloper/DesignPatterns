public class Singleton {

    private static Singleton singleInstance = null;

    private Singleton(){
        System.out.println("Hello from the constructor");
    }

    public static Singleton getInstance(){
        System.out.println("Hello from get instance");
        if (singleInstance ==null)
            singleInstance = new Singleton();
        return singleInstance;
    }
}
