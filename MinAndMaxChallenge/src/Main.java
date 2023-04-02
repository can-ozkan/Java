import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true){
            System.out.println("Enter a number: ");

            if (scanner.hasNextInt()){
                int user_input = scanner.nextInt();
                if (user_input > max) {
                    max = user_input;
                }

                if (user_input < min){
                    min = user_input;
                }


            } else {
                System.out.println("Invalid number");
                break;
            }

            scanner.nextLine();
        }

        System.out.println("Min value is " + min);
        System.out.println("Max value is " + max);

        scanner.close();
    }
}