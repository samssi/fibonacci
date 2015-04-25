package fi.samssi.fibonacci.ui;

import java.util.Scanner;

public class ClassicOrModernSelector {
    public int select() {
        System.out.print("Select calculator (c) Classic or (m) Modern: ");
        int selected = scanForClassicOrModern();
        return selected;
    }

    private int scanForClassicOrModern() {
        Scanner calculatorSelector = new Scanner(System.in);
        String selected = calculatorSelector.next();
        if (selected.equals("m")) {
            return 0;
        }
        else if (selected.equals("c")) {
            return 1;
        }
        else {
            return select();
        }
    }
}
