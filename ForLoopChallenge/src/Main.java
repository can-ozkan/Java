public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <=20; i++){
            System.out.println(i + " is prime? " + isPrime(i));
        }

        int totalPrimeNumber = 0;
        for (int i = 1; i <=100; i++){
            if (isPrime(i)){
                totalPrimeNumber++;
            }
        }

        System.out.println("There are " + totalPrimeNumber + " prime numbers between 1 and 100, inclusively");
    }

    public static boolean isPrime(int wholeNumber){


        if (wholeNumber < 2){
            return false;
        }
        for (int i=2; i <= wholeNumber / 2; i++){
            if (wholeNumber % i == 0){
                return false;

            }
        }
        return true;
    }
}