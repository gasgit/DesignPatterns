package ie.gasgit.Template;



/**
 * Created by glen on 25/09/16.
 */
public class TemplateRunner {

    public static void main(String[] args){

//        add an exception and redirect sys out from console to file
//        PrintStream fileStream = new PrintStream(new FileOutputStream("myfile.txt",true));
//        System.setOut(fileStream);

        PurchaseOrderTemplate instore = new InstorePurchaseOrder();
        instore.processOrder();

        PurchaseOrderTemplate online = new OnlinePurchaseOrder();
        online.processOrder();

    }
}
