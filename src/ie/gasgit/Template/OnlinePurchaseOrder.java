package ie.gasgit.Template;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by glen on 25/09/16.
 */
public class OnlinePurchaseOrder extends PurchaseOrderTemplate {
    @Override
    public void makeSelection() {
        System.out.println("Online");
        System.out.println();
        System.out.println("Add Items to cart");
        System.out.println("Select wrapping option");
        System.out.println("Select Delivery option and enter address");


    }

    @Override
    public void makePayment() {
        System.out.println("Pay using online payment method");

    }

    @Override
    public void addDate() {
        DateFormat s = DateFormat.getDateInstance(DateFormat.SHORT);
        Date d = new GregorianCalendar(2016, Calendar.SEPTEMBER, 30).getTime();
        System.out.println(s.format(d));

    }

    @Override
    public void trackDelivery() {
        System.out.println("Ship items to address");
        System.out.println();

    }

    @Override
    public void gatherFeedback() {

    }
}
