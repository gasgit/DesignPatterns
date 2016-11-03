package ie.gasgit.abstractfactory.factory;

import ie.gasgit.abstractfactory.ifaces.Color;
import ie.gasgit.abstractfactory.ifaces.Shape;

/**
 * Created by glen on 02/08/16.
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);

}
