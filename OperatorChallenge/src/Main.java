public class Main {
    public static void main(String[] args) {

        double number1 = 20.00; // step 1
        double number2 = 80.00; // step 2
        double step3 = (number1 + number2) * 100d;
        double step4 = step3 % 40.00;
        boolean step5 = (step4 == 0) ? true : false;

        System.out.println(step5);

    }
}