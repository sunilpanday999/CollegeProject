package LongDivision;

import java.util.Scanner;

public class LongDivisionMain {

    private static Scanner scanner = new Scanner(System.in); // build it in shared memory for memory access

    public static LongDivision getClientInput() {
        LongDivision div = new LongDivision();
        System.out.print("Enter your first number: ");
        int value1 = scanner.nextInt();
        System.out.print("Enter your second number: ");
        int value2 = scanner.nextInt();
        div.calculate(value1, value2);
        return div;
    }


    public static void main(String[] args) {
        LongDivision div1 = new LongDivision();
        div1.calculate(5, 3);
        System.out.println(div1.getString());
        // TODO - add your own constructors here to test it.


// uncomment when done to make more interactive
        LongDivision division3 = getClientInput();
        System.out.println(division3.getString());
    }

}
