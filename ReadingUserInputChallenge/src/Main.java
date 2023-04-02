import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;

        while (true){

            if (counter == 10){
                break;
            }
            System.out.println("Enter number #" + (counter+1));

            if (scanner.hasNextInt()){
                int user_input = scanner.nextInt();

                sum += user_input;
                counter++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();

        }

        System.out.println("Sum is " + sum);
        scanner.close();
    }
}