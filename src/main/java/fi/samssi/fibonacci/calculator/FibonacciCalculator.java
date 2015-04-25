package fi.samssi.fibonacci.calculator;

import fi.samssi.fibonacci.exception.FibonacciCalculatorException;

import java.util.ArrayList;
import java.util.List;

public class FibonacciCalculator {

    public List<Long> calculate(int startingNumber1, int startingNumber2, int totalNumbers) throws FibonacciCalculatorException {
        List<Long> results = initResults(startingNumber1, startingNumber2);
        for(int i = 0; i < totalNumbers; i++) {
            results.add(nextNumber(results));
        }
        return results;
    }

    private List<Long> initResults(long startingNumber1, long startingNumber2) {
        List<Long> results = new ArrayList<>();
        results.add(startingNumber1);
        results.add(startingNumber2);
        return results;
    }

    private long nextNumber(List<Long> result) {
        long last = result.get(result.size() - 1);
        long secondToLast = secondToLast(result);
        return didntOverflowResult(last, secondToLast);
    }

    private long didntOverflowResult(long x, long y) {
        long result;
        try {
             result = Math.addExact(x, y);
        } catch (ArithmeticException ae) {
            throw new FibonacciCalculatorException("This calculator can only calculate values up to: " + Long.MAX_VALUE + " BigInteger implementation would enable bigger number with the possibility to run out of memory.");
        }
        return result;
    }

    private long secondToLast(List<Long> result) {
        int index = result.size() - 2;
        return result.get(index);
    }

}
