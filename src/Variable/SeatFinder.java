package Variable;

import java.util.Scanner;

public class SeatFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // read client input
        System.out.println("Welcome to the seat finder!");

        System.out.print("Enter the total seats *per row* in a room? ");
        int rowSize = 20;

        System.out.print("Enter a seat number: ");

        // Student TODO Here:

        int seatSize = 42;
        int row = (seatSize-1) / (rowSize);
        int seat = (seatSize-1) % (rowSize);
        System.out.println("The student can be found in row: " + (row+1) +
                " and seat: " + (seat+1));

        scanner.close();
    }
    //The student can be found in row: 2 and seat: 5
}
