package Lab4;

public class TwentyQuestionsView {
    public void splash() {
        //TODO Student
        System.out.println("The game is launched. Have fun!");
    }

    public void welcome(){
        System.out.println("Welcome to Twenty Questions.\nPlease enter player name: ");
    }


    public void tooHigh(){
        System.out.println("Too high.");
    }

    public void tooLow(){
        System.out.println("Too low.");
    }


    public void winnerMessage(){
        System.out.println("Your guess is correct! Congratulations!\n");
    }


    public void loserMessage(){
        //TODO student
        System.out.println("You ran out of guesses. Better luck next time!\n");
    }


    public void exitGame() {
        System.out.println("Thank you for playing!\n");
    }
}
