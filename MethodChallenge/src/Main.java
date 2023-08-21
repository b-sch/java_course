public class Main {
    public static void main(String[] args) {

        System.out.println(displayHighScorePosition("Tim", calculateHighScorePosition(1500)));
        System.out.println(displayHighScorePosition("Tim", calculateHighScorePosition(1000)));
        System.out.println(displayHighScorePosition("Tim", calculateHighScorePosition(500)));
        System.out.println(displayHighScorePosition("Tim", calculateHighScorePosition(100)));
        System.out.println(displayHighScorePosition("Tim", calculateHighScorePosition(25)));


    }

    public static String displayHighScorePosition(String playerName, int scorePosition) {
        return playerName + " managed to get into position " + scorePosition + " on the high score list";
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if ((playerScore >= 500)) {
            position = 2;
        } else if ((playerScore >= 100)) {
            position = 3;
        }

        return position;
    }
}