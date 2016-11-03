package ie.gasgit.Singleton;

public class Main {

    public static void main(String[] args) {

        SingleObject singleObj = SingleObject.getInstance();

        for(int x = 0; x <= 10; x++){
            System.out.println("Instance Count: " + x);
            singleObj.showMessage();

        }

    }
}
