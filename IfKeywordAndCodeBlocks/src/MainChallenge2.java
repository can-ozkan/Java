public class MainChallenge2 {

    public static void main(String[] args) {

        // Parameters and arguments are terms that are often used interchangeably by developers
        // But technically, a parameter is the definition in the method declaration and the argument is the value passed to the method when we call it


        System.out.println(calculateFinalScore(100,5,200,false));
        System.out.println(calculateFinalScore(10000,8,200,true));
        System.out.println(calculateFinalScore(800,5,100,true));

    }

    private static int calculateFinalScore(int score, int levelCompleted, int bonus, boolean gameOver){

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
        }

        return finalScore;
    }
}
