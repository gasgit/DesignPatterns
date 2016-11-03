package ie.gasgit.builder.Items;


import ie.gasgit.builder.abscls.Burger;

/**
 * Created by glen on 04/08/16.
 */
public class ChickenBurger extends Burger {


    @Override
    public String name() {
        return "Chicken Burger";
    }


    @Override
    public float price() {
        return 2.00f;
    }
}
