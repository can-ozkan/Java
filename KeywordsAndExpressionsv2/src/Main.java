public class Main {
    public static void main(String[] args) {

        // int int = 2; you cannot do that
        // expression => an expression computes to a single value
        // Statements are standalone units of work
        // a code block is a set of zero, or, more statements, usually grouped together in some way to achieve a single goal

        double kilometers = (100 * 1.609344);
        int highScore = 50;

        if (highScore > 25){
            highScore = 1000 + highScore; // add bonus points

        }

        int health = 100;

        if ((health < 25) && (highScore > 1000)){
            highScore = highScore - 1000;
        }

    }
}