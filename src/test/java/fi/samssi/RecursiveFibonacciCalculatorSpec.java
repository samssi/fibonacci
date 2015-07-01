package fi.samssi;

import fi.samssi.fibonacci.calculator.FibonacciCalculator;
import fi.samssi.fibonacci.calculator.RecursiveFibonacciCalculator;

public class RecursiveFibonacciCalculatorSpec extends FibonacciSpec {
    @Override
    public FibonacciCalculator fibonacciCalculator() {
        return new RecursiveFibonacciCalculator();
    }
}
