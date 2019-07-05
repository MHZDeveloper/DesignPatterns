package withoutObserverInterface;

public class Demo {


    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexObserver(subject);

        System.out.println("First State : 4");
        subject.setState(4);
        System.out.println("----------");
        System.out.println("Second State : 5");
        subject.setState(5);
    }
}
