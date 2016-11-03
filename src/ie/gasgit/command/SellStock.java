package ie.gasgit.command;

/**
 * Created by glen on 02/11/16.
 */
public class SellStock implements Order {

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {

        stock.sell();

    }
}
