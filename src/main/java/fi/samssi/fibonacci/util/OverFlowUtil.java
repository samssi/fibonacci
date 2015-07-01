package fi.samssi.fibonacci.util;

import fi.samssi.fibonacci.exception.FibonacciCalculatorException;

public class OverFlowUtil {
    public static long didntOverflowResult(long x, long y) {
        long result;
        try {
            result = Math.addExact(x, y);
        } catch (ArithmeticException ae) {
            throw new FibonacciCalculatorException("This calculator can only calculate values up to: " + Long.MAX_VALUE + " BigInteger implementation would enable bigger number with the possibility to run out of memory.", ae);
        }
        return result;
    }
}
