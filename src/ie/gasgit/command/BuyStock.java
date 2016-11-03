package ie.gasgit.command;

/**
 * Created by glen on 02/11/16.
 */
public class BuyStock implements Order {

    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();

    }
}
