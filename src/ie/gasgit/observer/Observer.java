package ie.gasgit.observer;

/**
 * Created by glen on 03/08/16.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();

}
