package fi.samssi;

public class FibbonacciApp {

    public static void main( String[] args ) {
        FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
        fibonacciCalculator.calculate(1, 1, 1000);
    }
}
