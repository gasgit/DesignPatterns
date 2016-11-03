package ie.gasgit.builder.abscls;


import ie.gasgit.builder.concls.Bottle;
import ie.gasgit.builder.ifaces.Item;
import ie.gasgit.builder.ifaces.Packing;

/**
 * Created by glen on 04/08/16.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
