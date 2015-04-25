package fi.samssi.fibonacci.ui;

import fi.samssi.fibonacci.exception.NumberOfNumbersInputException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberOfNumberSelector {
    public int select() {
        String instructions = "Enter number of numbers being calculated: ";
        System.out.print(instructions);
        int selection = 0;
        try {
            selection = scanForNumberOfNumbers();
            System.out.println("Selected: " + selection);
        } catch (NumberOfNumbersInputException nonie) { }
        return selection;

    }

    private int scanForNumberOfNumbers() {
        Scanner numberOfNumbers;
        int result;
        try {
            numberOfNumbers = new Scanner(System.in);
            result = numberOfNumbers.nextInt();
        }
        catch (InputMismatchException ime) {
            System.out.println("Please give a valid number!");
            select();
            throw new NumberOfNumbersInputException();
        }
        return result;
    }
}
