public class Main {
    public static void main(String[] args) {

        System.out.println("10000 at 2% interest is " + calculateInterest(10000,2));

        System.out.println("*****************************");

        for (int i=1; i < 10; i++){
            //System.out.println("10000 at " +i + "% interest is " + calculateInterest(10000,i));
            System.out.printf("10000 at %d interest is %.2f\n", i, calculateInterest(10000,i));
        }

        System.out.println("*****************************");

        for (int i=9; i >= 2; i--){
            //System.out.println("10000 at " +i + "% interest is " + calculateInterest(10000,i));
            System.out.printf("10000 at %d interest is %.2f\n", i, calculateInterest(10000,i));
        }

        System.out.println(isPrime(5));
        System.out.println(isPrime(2));
        System.out.println(isPrime(17));
        System.out.println(isPrime(520));

        System.out.println("*****************************");

        int primeCounter = 0;

        for (int i = 2; i < 100; i++){
            if (isPrime(i)){
                // System.out.println(i);
                primeCounter++;
            }
        }

        System.out.println("There are " + primeCounter + " prime number between 2 and 100");

    }

    public static double calculateInterest(double amount, double interestRate){
        return amount * (interestRate / 100);
    }

    public static boolean isPrime(int number){
        if (number < 2) {return false;}

        for (int i = 2; i<number; i++){
            if (number % i == 0)
                return false;
        }

        return true;
    }
}