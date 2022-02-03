import java.util.Scanner;

public class WhileLoopTwoDivide {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum;

        userNum = scnr.nextInt();

        /* Your solution goes here  */
        while(userNum > 0){

            userNum = userNum / 2;
            System.out.print(userNum + " ");
        }

        System.out.println("");
    }
}
