package ie.gasgit.Strategy;

/**
 * Created by glen on 03/08/16.
 */
public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
