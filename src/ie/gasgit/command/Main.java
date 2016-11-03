package ie.gasgit.command;


/*
 * Command Pattern - data driven pattern (Behavioral)
 */

public class Main {

    public static void main(String[] args) {

        Stock newStock = new Stock();
        BuyStock buyStock  = new BuyStock(newStock);
        SellStock sellStock = new SellStock(newStock);

        Broker b = new Broker();
        b.takeOrder(buyStock);
        b.takeOrder(sellStock);

        b.placeOrders();
	// write your code here
    }
}
