public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++ ){
            System.out.println(i);
        }

        for (int i = 1; i <= 5; i++){
            System.out.println("10000 dollar with an interest rate of " + i + " gives you " + calculateInterest(10000,i));
        }

        for (double i = 7.5; i <= 10.0; i += 0.25){
            System.out.println("100 dollar with an interest rate of " + i + " gives you " + calculateInterest(100,i));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }
}