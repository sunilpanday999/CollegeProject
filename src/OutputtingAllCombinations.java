import java.util.Scanner;

public class OutputtingAllCombinations {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        char a;
        char b;
        char c;

        a = scnr.next().charAt(0);
        b = scnr.next().charAt(0);
        c = scnr.next().charAt(0);
        //xyz xzy yxz yzx zxy zyx
        /* Your solution goes here  */
        System.out.print(""+a+b+c+ " " +a+c+b+" "+b+a+c+" "+b+c+a+" "+c+a+b+" "+c+b+a);

        System.out.println("");
    }
}
