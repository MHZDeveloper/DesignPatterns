package withoutObserverInterface;

public class HexObserver implements Observer {


    private Subject subject;

    public HexObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }

    public void update() {
        System.out.println("Hex withoutObserverInterface.Observer : "+Integer.toHexString(subject.getState()));
    }
}
