package ie.gasgit.Strategy;

/**
 * Created by glen on 03/08/16.
 */
public class Context {

    Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
