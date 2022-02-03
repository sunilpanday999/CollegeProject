import java.util.Scanner;

public class TwoStringAlphabetically {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        String firstString;
        String secondString;

        firstString  = scnr.next();
        secondString = scnr.next();

        /* Your solution goes here  */
        if(firstString.compareTo(secondString) <= 0){
            System.out.println(firstString + " " + secondString);
        }
        else {
            System.out.println(secondString + " " + firstString);
        }

    }
}
