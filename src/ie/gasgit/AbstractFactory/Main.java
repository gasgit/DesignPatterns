package ie.gasgit.AbstractFactory;


import ie.gasgit.AbstractFactory.factory.AbstractFactory;
import ie.gasgit.AbstractFactory.factory.FactoryProducer;
import ie.gasgit.AbstractFactory.ifaces.Color;
import ie.gasgit.AbstractFactory.ifaces.Shape;

public class Main {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shape1 = shapeFactory.getShape("SQUARE");
        shape1.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color1 = colorFactory.getColor("RED");
        color1.fill();


    }
}
