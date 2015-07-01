package fi.samssi;

import fi.samssi.fibonacci.calculator.FibonacciCalculator;
import fi.samssi.fibonacci.calculator.RecursiveFibonacciCalculator;
import fi.samssi.fibonacci.exception.FibonacciCalculatorException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FibonacciSpec {

    private final FibonacciCalculator fibonacciCalculator = new RecursiveFibonacciCalculator();
    private final int totalNumbers = 4;

    @Test
    public void classicFibonacciCalculation() {
        List<Long> expectedResult = Arrays.asList(1L, 1L, 2L, 3L, 5L, 8L);
        Assert.assertEquals("Sum of two previous numbers: ", expectedResult, fibonacciCalculator.calculate(1, 1, totalNumbers));
    }

    @Test
    public void modernFibonacciCalculation() {
        List<Long> expectedResult = Arrays.asList(0L, 1L, 1L, 2L, 3L, 5L);
        Assert.assertEquals("Sum of two previous numbers: ", expectedResult, fibonacciCalculator.calculate(0, 1, totalNumbers));
    }

    @Test(expected = FibonacciCalculatorException.class)
    public void overFlowCalculation() {
        fibonacciCalculator.calculate(0, 1, 1000);
    }

}
