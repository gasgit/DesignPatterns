package ie.gasgit.observer;

/**
 * Created by glen on 03/08/16.
 */
public class OctalObserver extends Observer {


    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));

    }
}
