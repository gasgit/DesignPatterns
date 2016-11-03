package ie.gasgit.template;

/**
 * Created by glen on 25/09/16.
 */
public class TemplateRunner {

    public static void main(String[] args) {

        PurchaseOrderTemplate instore = new InstorePurchaseOrder();
        instore.processOrder();

        PurchaseOrderTemplate online = new OnlinePurchaseOrder();
        online.processOrder();

    }
}
