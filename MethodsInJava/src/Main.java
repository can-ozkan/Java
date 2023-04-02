public class Main {
    public static void main(String[] args) {

        System.out.println("Your final score is " + calculateScore(true,10000,8,150));
        System.out.println("Your final score is " + calculateScore(false,10000,8,150));

        displayHighScorePosition("Can", calculateHighScorePosition(1500));
        displayHighScorePosition("Betul", calculateHighScorePosition(900));
        displayHighScorePosition("Yakup", calculateHighScorePosition(400));
        displayHighScorePosition("Nuri", calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver) {
            return score + (levelCompleted * bonus) + 1000;
        }
        return  -1;
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if (score >= 1000)
            return 1;
        else if (score >= 500)
            return 2;
         else if (score >= 100)
            return 3;
         else
             return 4;
    }
}