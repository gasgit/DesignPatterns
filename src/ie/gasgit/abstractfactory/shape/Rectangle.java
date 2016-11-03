package ie.gasgit.abstractfactory.shape;


import ie.gasgit.abstractfactory.ifaces.Shape;

/**
 * Created by glen on 02/08/16.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("IN RECTANGLE");

        System.out.println("METHOD: Drawing Rectangle!");
    }
}
