package fi.samssi;

public class FibonacciCalculatorException extends RuntimeException {

    public FibonacciCalculatorException(String message) {
        super(message);
        super.printStackTrace();
    }
}
