package ie.gasgit.builder.Items;


import ie.gasgit.builder.abscls.Burger;

/**
 * Created by glen on 04/08/16.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veggi Burger";
    }

    @Override
    public float price() {
        return 1.50f;
    }
}
