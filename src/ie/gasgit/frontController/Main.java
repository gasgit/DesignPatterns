package ie.gasgit.frontController;

public class Main {

    public static void main(String[] args) {

        FrontController frontController = new FrontController();
        frontController.dispatchRequest("USER");
        System.out.println();
        frontController.dispatchRequest("HOME");
    }
}
