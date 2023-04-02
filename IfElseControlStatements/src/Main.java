public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 & score > 1000){
            System.out.println("Your score is less than 5000 and higher than 1000.");
        } else if (score < 1000) {
            System.out.println("Your score is less than 1000.");
        } else {
            System.out.println("You got here.");
        }

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }

        // int savedFinalScore = finalScore; you cannot do that due to variable scope.

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }

        // we can eliminate this code duplication via method.


    }
}