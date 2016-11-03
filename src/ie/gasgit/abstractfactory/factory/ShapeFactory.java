package ie.gasgit.abstractfactory.factory;

import ie.gasgit.abstractfactory.ifaces.Color;
import ie.gasgit.abstractfactory.ifaces.Shape;
import ie.gasgit.abstractfactory.shape.Circle;
import ie.gasgit.abstractfactory.shape.Rectangle;
import ie.gasgit.abstractfactory.shape.Square;


/**
 * Created by glen on 02/08/16.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {

        if(shape == null){
            return null;
        }else if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}
