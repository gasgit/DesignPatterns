package ie.gasgit.abstractfactory.color;

import ie.gasgit.abstractfactory.ifaces.Color;

/**
 * Created by glen on 02/08/16.
 */
public class Red implements Color {
    @Override
    public void fill() {


        System.out.println("--------------------------------------");
        System.out.println("FactoryProducer gets ColorFactory");
        System.out.println("ColorFactory extends AbstractFactory");
        System.out.println("Red implements Color");
        System.out.println("Filling Red!");
        System.out.println("--------------------------------------");

    }
}
