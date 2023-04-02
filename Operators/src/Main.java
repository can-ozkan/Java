public class Main {
    public static void main(String[] args) {

        int result = 1 + 2;

        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println(previousResult);

        result = result - 1;
        System.out.println("Sum " + result);
        System.out.println("Previous result " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 is " + result);

        result = result / 5;
        System.out.println("20 / 5 is " + result);

        result = result % 3; // remainder operator
        System.out.println("4 % 3 is " + result);

        result++;
        result--;
        result += 2;
        result *= 10;
        result /= 3;
        result -= 2;

        System.out.println(result);

        boolean isAlien = false;

        if (isAlien == false){
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 100;
        if (topScore == 100){
            System.out.println("You got the high score");
        }


    }
}