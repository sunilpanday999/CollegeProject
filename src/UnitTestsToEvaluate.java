import java.util.Scanner;

public class UnitTestsToEvaluate {
    public static double kiloToPounds(double kilos) {
        // This statement intentionally has an error.
        double pounds = kilos * 2.204;
        return pounds;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        double kilos;
        double pounds;

        kilos = scnr.nextDouble();

        pounds = kiloToPounds(kilos);
        System.out.println(pounds + " lbs");
    }
}
