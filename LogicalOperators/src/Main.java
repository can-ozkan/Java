public class Main {
    public static void main(String[] args) {

        int topScore = 99;
        int secondTopScore = 60;

        if (topScore == 100){
            System.out.println("You got 100");
        }

        if (topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top score and less than 100");
        }

        // ternary operator

        boolean isCar = false;
        boolean wasCar = isCar ? true : false;

        System.out.println(wasCar);
    }
}