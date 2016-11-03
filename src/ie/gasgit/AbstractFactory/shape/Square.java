package ie.gasgit.AbstractFactory.shape;


import ie.gasgit.AbstractFactory.ifaces.Shape;

/**
 * Created by glen on 02/08/16.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("CLASS SQUARE");
        System.out.println("METHOD: Drawing Square!");
    }
}
