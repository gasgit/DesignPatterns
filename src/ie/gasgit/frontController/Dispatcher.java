package ie.gasgit.frontController;

/**
 * Created by glen on 03/08/16.
 */
public class Dispatcher {

    private HomePage homePage;
    private UserPage userPage;

    public Dispatcher(){
        userPage = new UserPage();
        homePage = new HomePage();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("USER")){
            userPage.show();
        }else if(request.equalsIgnoreCase("HOME")){
            homePage.show();
        }
    }
}
