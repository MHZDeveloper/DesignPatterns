package withoutObserverInterface;

public class BinaryObserver implements Observer {

    private Subject subject;

    public BinaryObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }

    public void update() {
        System.out.println("Binary withoutObserverInterface.Observer : "+Integer.toBinaryString(subject.getState()));
    }
}
