package ie.gasgit.strategy;

/**
 * Created by glen on 03/08/16.
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
