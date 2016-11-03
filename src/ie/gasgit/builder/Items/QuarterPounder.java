package ie.gasgit.builder.Items;


import ie.gasgit.builder.abscls.Burger;

/**
 * Created by glen on 04/08/16.
 */
public class QuarterPounder extends Burger {
    @Override
    public String name() {
        return "Royal with Cheese";
    }

    @Override
    public float price() {
        return 2.50f;
    }
}
