package Lab4;

import java.util.Random;
import java.util.Scanner;

public class TwentyQuestionsMain {
    /**
     * Main driver for the program.
     */
    public static void main(String[] args) {
        // These are the different objects the control needs to work
        TwentyQuestionsView mainView = new TwentyQuestionsView();
//        TwentyQuestions game = new TwentyQuestions();

        mainView.splash();
        mainView.welcome();
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        System.out.println(TwentyQuestions.nameIntroduction(playerName));
        Random random = new Random();
        int num = random.nextInt(99) + 1;
        System.out.println(num);
        int guessCounter = 0;
        System.out.println("A number between 1-100 has been chosen.");
        while(guessCounter < 20){
            System.out.println("Enter a guess: ");
            int guess = random.nextInt(99);
            System.out.println(guess);
            guessCounter++;
            if(TwentyQuestions.playGame(guess, num) == 0){
                mainView.winnerMessage();
                break;
            }
            if(TwentyQuestions.playGame(guess, num) == -1){
                mainView.tooLow();
            }
            else{
                mainView.tooHigh();
            }
        }
        if(guessCounter >= 20){
            mainView.loserMessage();
        }
        System.out.println("The number was " + num + ", " + TwentyQuestions.numberInfo(num));
        mainView.exitGame();
    }
}
