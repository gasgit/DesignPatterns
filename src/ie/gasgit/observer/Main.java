package ie.gasgit.observer;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    Subject subject = new Subject();
        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);


        for(int i= 0; i<= 15; i++){

            System.out.println("State change: " + i);
            subject.setState(i);


        }


    }
}
