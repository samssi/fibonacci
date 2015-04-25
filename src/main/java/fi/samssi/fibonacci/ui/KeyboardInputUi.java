package fi.samssi.fibonacci.ui;

import fi.samssi.fibonacci.calculator.FibonacciCalculator;


public class KeyboardInputUi {
    private final boolean running = true;
    public void receiveInput() {
        while (running) {
            ClassicOrModernSelector classicOrModernSelector = new ClassicOrModernSelector();
            int startingNumber1 = classicOrModernSelector.select();
            NumberOfNumberSelector numberOfNumberSelector = new NumberOfNumberSelector();
            int numberOfNumbers = numberOfNumberSelector.select();
            FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
            fibonacciCalculator.calculate(startingNumber1, 1, numberOfNumbers);
        }
    }
}
