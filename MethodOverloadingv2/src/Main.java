public class Main {
    public static void main(String[] args) {
        // A method signature consists of name of the method, and the uniqueness of the declaration of its parameters
        // a method's return type is not part of the signature
        // a parameter name is not also part of the signature
        // the type, order, and number of parameters in conjunction with the name make a method signature unique
        // a unique method signature is the key for Java compiler to determine if a method is overloaded correctly
        // 1 inch = 2.54 cm
        // 1 foot = 12 inches

        printScore("Can", 90);
        printScore("Betul", 80);
        printScore( 70);
        printScore("Nafiye");
        printScore();

        System.out.println(convertToCentimeters(5,8));
        System.out.println(convertToCentimeters(68));
    }

    public static void printScore(String playerName, int playerScore){
        System.out.println("Player " + playerName + " scored " + playerScore);
    }

    public static void printScore(int playerScore){
        System.out.println("Unnamed player scored " + playerScore);
    }

    public static void printScore(String playerName){
        System.out.println("Player " + playerName + " scored unknown");
    }

    public static void printScore(){
        System.out.println("No player name, no player score inputted");
    }

    public static double convertToCentimeters(int inches){
        // the parameters represent height in terms of inches
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches){
        // 1 inch = 2.54 cm
        // 1 foot = 12 inches
        int feetToInches = feet * 12;

        return convertToCentimeters(feetToInches+inches);
    }




}