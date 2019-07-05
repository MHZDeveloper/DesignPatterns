package withoutObserverInterface;

public class OctalObserver implements Observer {

    private Subject subject;

    public OctalObserver(Subject subject){
        this.subject=subject;
        subject.attach(this);
    }

    public void update() {
        System.out.println("Octal withoutObserverInterface.Observer : "+Integer.toOctalString(subject.getState()));
    }
}
