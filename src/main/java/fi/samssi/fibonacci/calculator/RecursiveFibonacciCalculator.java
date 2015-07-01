package fi.samssi.fibonacci.calculator;

import fi.samssi.fibonacci.exception.FibonacciCalculatorException;

import java.util.ArrayList;
import java.util.List;

import static fi.samssi.fibonacci.util.OverFlowUtil.didntOverflowResult;

public class RecursiveFibonacciCalculator implements FibonacciCalculator {
    public List<Long> calculate(int startingNumber1, int startingNumber2, int totalNumbers) throws FibonacciCalculatorException {
        return recursiveCalculation(startingNumber1, startingNumber2, totalNumbers, new ArrayList<>());
    }

    private List<Long> recursiveCalculation(final long x, final long y, final int total, final List<Long> numbers) {
        if (numbers.isEmpty()) {
            numbers.add(x);
            numbers.add(y);
        }
        return compute(x, y, total, numbers);
    }

    private List<Long> compute(final long x, final long y, final int total, final List<Long> numbers) {
        if (total <= numbers.size() - 2) {
            return numbers;
        }

        else {
            long previous = y;
            long next = didntOverflowResult(x, y);
            numbers.add(next);
            return recursiveCalculation(previous, next, total, numbers);
        }
    }
}
