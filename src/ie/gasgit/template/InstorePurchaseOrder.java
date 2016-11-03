package ie.gasgit.template;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by glen on 25/09/16.
 */
public class InstorePurchaseOrder extends PurchaseOrderTemplate{
    @Override
    public void makeSelection() {
        System.out.println("Instore");
        System.out.println();
        System.out.println("Customer selects items!!");

    }

    @Override
    public void makePayment() {
        System.out.println("Customer pays for items!!!");

    }

    @Override
    public void addDate() {
//        DateFormat s = DateFormat.getDateInstance(DateFormat.LONG);
//        Date d = new GregorianCalendar(2016, Calendar.SEPTEMBER, 30).getTime();
//        System.out.println(s.format(d));
//        System.out.println();

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println();


    }

    @Override
    public void trackDelivery() {
        System.out.println("Items delivered!!");
        System.out.println();

    }

    @Override
    public void gatherFeedback() {

    }
}
