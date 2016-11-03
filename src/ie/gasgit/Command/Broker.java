package ie.gasgit.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by glen on 02/11/16.
 */
public class Broker {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){

        for(Order order : orderList){
            order.execute();

        }

        orderList.clear();
    }
}
