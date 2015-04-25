package fi.samssi.fibonacci.ui;

import fi.samssi.fibonacci.calculator.FibonacciCalculator;
import fi.samssi.fibonacci.exception.FibonacciCalculatorException;


public class KeyboardInputUi {
    public void start() {
        welcomeMessage();
        receiveInput();
    }

    private void receiveInput() {
        while (true) {
            try {
                ClassicOrModernSelector classicOrModernSelector = new ClassicOrModernSelector();
                int startingNumber1 = classicOrModernSelector.select();
                NumberOfNumberSelector numberOfNumberSelector = new NumberOfNumberSelector();
                int numberOfNumbers = numberOfNumberSelector.select();
                FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
                fibonacciCalculator.calculate(startingNumber1, 1, numberOfNumbers);
            } catch (FibonacciCalculatorException fce) {
                System.out.println(fce.getMessage());
                receiveInput();
            }
        }
    }

    private void welcomeMessage() {
        System.out.println("Welcome to Fibonacci calculator.");
    }
}
