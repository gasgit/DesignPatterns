package ie.gasgit.builder.Items;

import ie.gasgit.builder.abscls.ColdDrink;

/**
 * Created by glen on 04/08/16.
 */
public class Beer extends ColdDrink {
    @Override
    public String name() {
        return "Cold One!!";
    }

    @Override
    public float price() {
        return 5.00f;
    }
}
