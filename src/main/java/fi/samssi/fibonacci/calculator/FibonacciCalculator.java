package fi.samssi.fibonacci.calculator;

import fi.samssi.fibonacci.exception.FibonacciCalculatorException;

import java.util.List;

public interface FibonacciCalculator {
    List<Long> calculate(int startingNumber1, int startingNumber2, int totalNumbers) throws FibonacciCalculatorException;
}
