public class Main {
    public static void main(String[] args) {

        displayHighScorePosition("Can", calculateHighScorePosition(1500));
        displayHighScorePosition("Betul", calculateHighScorePosition(1000));
        displayHighScorePosition("Yakup", calculateHighScorePosition(800));
        displayHighScorePosition("Hakan", calculateHighScorePosition(500));
        displayHighScorePosition("Nuri", calculateHighScorePosition(100));
        displayHighScorePosition("Nafiye", calculateHighScorePosition(50));
    }

    private static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }

    private static int calculateHighScorePosition(int score){
        if (score >= 1000){
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }

    }
}