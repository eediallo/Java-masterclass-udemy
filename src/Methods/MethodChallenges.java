package Methods;

public class MethodChallenges {

    static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position "
                + playerPosition + " on the high score list");
    }

    static int calculateHighScore(int playerScore){
        int position = 4;

        if(playerScore >= 1000){
            position = 1;
        }else if (playerScore >= 500){
            position = 2;
        }else if (playerScore >= 100){
            position = 3;
        }

        return position;
    }

    static void main(String[] args) {
        int highScorePosition = calculateHighScore(1500);
        displayHighScorePosition("Elhadj",  highScorePosition);


        highScorePosition = calculateHighScore(1000);
        displayHighScorePosition("Ousmane",  highScorePosition);


        highScorePosition = calculateHighScore(500);
        displayHighScorePosition("Mariam",  highScorePosition);

        highScorePosition = calculateHighScore(100);
        displayHighScorePosition("Fatim",  highScorePosition);

        highScorePosition = calculateHighScore(25);
        displayHighScorePosition("Mamadou",  highScorePosition);

    }
}
