package ie.gasgit.abstractfactory.factory;



import ie.gasgit.abstractfactory.color.Blue;
import ie.gasgit.abstractfactory.color.Green;
import ie.gasgit.abstractfactory.color.Red;
import ie.gasgit.abstractfactory.ifaces.Color;
import ie.gasgit.abstractfactory.ifaces.Shape;

/**
 * Created by glen on 03/08/16.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }else if(color.equalsIgnoreCase("RED")){
            return new Red();
        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
