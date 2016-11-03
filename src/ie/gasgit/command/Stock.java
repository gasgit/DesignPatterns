package ie.gasgit.command;

/**
 * Created by glen on 02/11/16.
 *
 * command Pattern - data driven pattern (Behavioral)
 */
public class Stock {

    private String name = "stock_name";
    private int qty = 100;

    public void buy(){
        System.out.println("Stock [ Name: " + name +  ", Quantity: " + qty + " ] bought");
    }

    public void sell(){
        System.out.println("Stock [ Name: " + name +  ", Quantity: " + qty + " ] sold");
    }
}
