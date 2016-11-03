package ie.gasgit.frontController;

/**
 * Created by glen on 03/08/16.
 */
public class FrontController {

    private Dispatcher dispatcher;

    public FrontController(){
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticatedUser(){
        System.out.println("User Authenticated!");
        return true;
    }

    private void trackRequest(String request){
        System.out.println("Page Requested: " + request);
    }

    public void dispatchRequest(String request){
        trackRequest(request);
        if(isAuthenticatedUser()){
            dispatcher.dispatch(request);
        }
    }
}
