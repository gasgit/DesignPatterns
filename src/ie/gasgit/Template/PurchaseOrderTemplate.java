package ie.gasgit.Template;

/**
 * Created by glen on 25/09/16.
 */
public abstract class PurchaseOrderTemplate {

    public abstract void makeSelection();
    public abstract void makePayment();
    public abstract void addDate();


    public final void addPackaging(){
        System.out.println("Wrapping completed :)");
    }

    public abstract void trackDelivery();

    public final void processOrder(){
        makeSelection();
        makePayment();
        addPackaging();
        trackDelivery();
        addDate();
    }

    public abstract void gatherFeedback();




}
