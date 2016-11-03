package ie.gasgit.abstractfactory.color;

import ie.gasgit.abstractfactory.ifaces.Color;

/**
 * Created by glen on 02/08/16.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("CLASS RED");
        System.out.println("METHOD: Filling Red!");

    }
}
