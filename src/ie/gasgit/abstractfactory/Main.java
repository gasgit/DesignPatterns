package ie.gasgit.abstractfactory;


import ie.gasgit.abstractfactory.factory.AbstractFactory;
import ie.gasgit.abstractfactory.factory.FactoryProducer;
import ie.gasgit.abstractfactory.ifaces.Color;
import ie.gasgit.abstractfactory.ifaces.Shape;

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
