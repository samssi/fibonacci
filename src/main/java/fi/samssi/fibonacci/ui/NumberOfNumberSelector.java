package fi.samssi.fibonacci.ui;

import fi.samssi.fibonacci.exception.NumberOfNumbersInputException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberOfNumberSelector {
    public int select() {
        String instructions = "Enter number of numbers being calculated: ";
        System.out.print(instructions);
        int selection;
        try {
            selection = scanForNumberOfNumbers();
        }
        catch (NumberOfNumbersInputException e) {
            selection = select();
        }
        return selection;

    }

    private int scanForNumberOfNumbers() throws NumberOfNumbersInputException {
        Scanner numberOfNumbers;
        int result;
        try {
            numberOfNumbers = new Scanner(System.in);
            result = numberOfNumbers.nextInt();
        }
        catch (InputMismatchException ime) {
            System.out.println("Valid number only accepted here!");
            throw new NumberOfNumbersInputException();
        }
        return result;
    }
}
