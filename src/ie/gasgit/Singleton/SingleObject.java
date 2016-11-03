package ie.gasgit.Singleton;

/**
 * Created by glen on 03/08/16.
 */
public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("This is a single instance of SingleObject!");
    }

}
