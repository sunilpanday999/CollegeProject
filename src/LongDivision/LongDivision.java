package LongDivision;

public class LongDivision {

    // four instance variables here
    int quotient  = 0;
    int remainder = 0;
    int value1 = 0;
    int value2 = 0;


    public void calculate(int value1, int value2) {
        // your code here!
        quotient = value1 / value2;
        remainder = value1 % value2;
        System.out.println(value1 + " divided by "+ value2);
        System.out.println("Quotient: "+ quotient);
        System.out.println("Remainder: "+ remainder);
    }

    public String getString() {
        String str = value1 + " divided by " + value2;
        return str; // change this!
    }



}
