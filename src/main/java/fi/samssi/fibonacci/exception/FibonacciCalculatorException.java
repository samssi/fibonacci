package fi.samssi.fibonacci.exception;

public class FibonacciCalculatorException extends RuntimeException {

    public FibonacciCalculatorException(String message, Throwable cause) {
        super(message, cause);
    }
}
