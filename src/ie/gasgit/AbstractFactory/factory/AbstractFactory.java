package ie.gasgit.AbstractFactory.factory;

import ie.gasgit.AbstractFactory.ifaces.Color;
import ie.gasgit.AbstractFactory.ifaces.Shape;

/**
 * Created by glen on 02/08/16.
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);

}
