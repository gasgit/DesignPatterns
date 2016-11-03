package ie.gasgit.AbstractFactory.color;

import ie.gasgit.AbstractFactory.ifaces.Color;

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
