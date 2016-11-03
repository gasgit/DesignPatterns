package ie.gasgit.builder.Items;


import ie.gasgit.builder.abscls.ColdDrink;

/**
 * Created by glen on 04/08/16.
 */
public class Cola extends ColdDrink {
    @Override
    public String name() {
        return "Super Cola";
    }

    @Override
    public float price() {
        return 1.00f;
    }
}
