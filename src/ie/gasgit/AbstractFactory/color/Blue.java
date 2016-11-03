package ie.gasgit.AbstractFactory.color;


import ie.gasgit.AbstractFactory.ifaces.Color;

/**
 * Created by glen on 02/08/16.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("CLASS BLUE");
        System.out.println("METHOD: Filling Blue!");
    }
}
