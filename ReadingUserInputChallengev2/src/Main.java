import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        double sum = 0;

        do {
            System.out.println("Enter number #" + counter + ":");
            String currentNumber = scanner.nextLine();

            try{
                double number = Double.parseDouble(currentNumber);
                counter++;
                sum += number;
            } catch (Exception e){
                System.out.println("Not a valid number");
            }

        }while (counter <=5);

        System.out.println("Sum = " + sum);
    }



}