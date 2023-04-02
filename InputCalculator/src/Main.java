import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage(){

        int sum = 0;
        long avg = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);

        while (true){

            if (scanner.hasNextInt()){
                int user_input = scanner.nextInt();
                scanner.nextLine();
                sum += user_input;
                counter++;
            } else {
                if (counter == 0){
                    System.out.println("SUM = 0 AVG = 0");
                    break;
                } else {
                    avg = (long)Math.round(sum / counter);
                    System.out.println("SUM = " + sum + " AVG = " + avg);
                    break;
                }

            }
        }

        scanner.close();
    }
}