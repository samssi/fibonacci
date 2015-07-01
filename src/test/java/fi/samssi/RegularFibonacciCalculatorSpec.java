package fi.samssi;

import fi.samssi.fibonacci.calculator.FibonacciCalculator;
import fi.samssi.fibonacci.calculator.RegularFibonacciCalculator;

public class RegularFibonacciCalculatorSpec extends FibonacciSpec {
    @Override
    public FibonacciCalculator fibonacciCalculator() {
        return new RegularFibonacciCalculator();
    }
}
