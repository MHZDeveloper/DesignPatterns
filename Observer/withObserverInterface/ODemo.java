package withObserverInterface;

public class ODemo {

    public static void main(String[] args) {
        OSubject subject = new OSubject();
        subject.addObserver(new OBinaryObserver(subject));

        subject.setState(5);
    }
}
