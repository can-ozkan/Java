import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        int counter = 0;

        while (true){
            System.out.println("Enter a number, or any character to exit");
            String userInput = scanner.nextLine();

            try{
                double number = Double.parseDouble(userInput);
                counter++;
                if (number < min){
                    min = number;
                }

                if (number > max){
                    max = number;
                }
            } catch (NumberFormatException nfe){
                break;
            }
        }

        if (counter > 0){
            System.out.println("Minimum number entered is " + min);
            System.out.println("Maximum number entered is " + max);
            System.out.println("There are " + counter + " number entered by the user");
        } else {
            System.out.println("No valid numeric data was entered by the user");
        }


    }
}