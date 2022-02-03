package Lab4;

public class TwentyQuestions {

    public static String nameIntroduction(String playerName){
        playerName = playerName.toUpperCase();
        String message = "";

        //TODO student
        char firstCharPlayerName = playerName.charAt(0);
        int playerNameLen = playerName.length();
        if((firstCharPlayerName >= 'A' && firstCharPlayerName <= 'M')  ){
            message = "Hi " + playerName;
            if(playerNameLen <= 5) {
                message += ", are you up to the challenge?";
            } else {
                message += ", good luck!";
            }
        }else{
            message = "Hello " + playerName;
            if(playerNameLen <= 5) {
                message += ", are you up to the challenge?";
            } else {
                message += ", good luck!";
            }
        }

        return message;
    }


    public static int playGame(int guess, int num) {
        if(guess < num){
            return -1;
        } else if(guess > num){
            return 1;
        }
        return 0;
    }

    public static String numberInfo(int number){
        //TODO student
        if(number == 7){
            return "lucky sevens!";
        } else if(number < 10 && number > 0){
            return "a single digit";
        } else if(number == 42){
            return "the answer to life the universe and everything.";
        }
        return "a positive number.";
    }

}
