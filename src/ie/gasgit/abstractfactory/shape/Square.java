package ie.gasgit.abstractfactory.shape;


import ie.gasgit.abstractfactory.ifaces.Shape;

/**
 * Created by glen on 02/08/16.
 */
public class Square implements Shape {
    @Override
    public void draw() {

        System.out.println("--------------------------------------");
        System.out.println("FactoryProducer gets ShapeFactory");
        System.out.println("ShapeFactory extends AbstractFactory");
        System.out.println("Square implements Shape");
        System.out.println("Drawing Square!");
        System.out.println("--------------------------------------");



    }
}
