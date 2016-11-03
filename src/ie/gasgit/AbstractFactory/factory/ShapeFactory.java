package ie.gasgit.AbstractFactory.factory;

import ie.gasgit.AbstractFactory.ifaces.Color;
import ie.gasgit.AbstractFactory.ifaces.Shape;
import ie.gasgit.AbstractFactory.shape.Circle;
import ie.gasgit.AbstractFactory.shape.Rectangle;
import ie.gasgit.AbstractFactory.shape.Square;


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
