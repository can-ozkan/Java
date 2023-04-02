public class Main {
    public static void main(String[] args) {

        // We need to create unique method signature

        printScore("Can", calculateScore(100));
        printScore(calculateScore(50));
        printScore();

        System.out.println(calcFeetAndInchesToCentimeters(6,0));
        System.out.println(calcFeetAndInchesToCentimeters(7,5));
        System.out.println(calcFeetAndInchesToCentimeters(-10,5));
        System.out.println(calcFeetAndInchesToCentimeters(100));
        System.out.println(calcFeetAndInchesToCentimeters(156));
        System.out.println(calcFeetAndInchesToCentimeters(-10));
    }

    public static int calculateScore(int score){
        return score * 100 + 50;
    }

    public static void printScore(String name, int score){
        System.out.println("Player " + name + " scored " + score + " points");
    }

    public static void printScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
    }

    public static void printScore(){
        System.out.println("No player name and no player score");
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        // 1 inch = 2.54cm
        // 1 foot = 12 inches

        if (feet >= 0 && inches >= 0 && inches <= 12){
            return (inches * 2.54) + (feet * 12 * 2.54);
        }

        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0){
            double howManyFeet = (int) inches / 12;
            double remainingInches = (int)inches % 12;
            return calcFeetAndInchesToCentimeters(howManyFeet,remainingInches);
        }

        return -1;
    }

}