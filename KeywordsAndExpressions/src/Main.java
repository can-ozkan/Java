public class Main {
    public static void main(String[] args) {

        double kilometers = (100 * 1.609344);

        int highScore = 50; // entire line is a statement and highScore = 50 is expression
        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        highScore++; // entire line is a statement
        highScore--; // entire line is a statement

        // method call is also a statement
        System.out.println("This is a test"); // entire line is a statement, parameter itself is an expression
    }
}