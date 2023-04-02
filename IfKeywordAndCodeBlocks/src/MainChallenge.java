public class MainChallenge {

    public static void main(String[] args) {
        // it is a bad code example
        // one example is that what if you decided to change the formula?
        // solution: use a method

        // for better code, look at MainChallange2 class

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }
    }



}
