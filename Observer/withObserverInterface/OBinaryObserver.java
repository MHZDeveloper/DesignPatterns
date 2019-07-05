package withObserverInterface;

import java.util.Observable;
import java.util.Observer;

public class OBinaryObserver implements Observer {

    private OSubject oSubject;

    public OBinaryObserver(OSubject oSubject){
        this.oSubject=oSubject;
    }

    public void update(Observable observable, Object o) {
        if (oSubject==observable)
            System.out.println("Binary withoutObserverInterface.Observer : "+Integer.toBinaryString(oSubject.getState()));
    }
}
