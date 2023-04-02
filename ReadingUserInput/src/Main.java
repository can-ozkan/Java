import java.util.InputMismatchException;
import java.util.Scanner;
// import statement lets us use classes from other people code

public class Main {
    public static void main(String[] args) {

        // There are wrapper methods to parse strings to numeric values

        int currentYear = 2023;
        int dateOfBirth = Integer.parseInt("1994");

        System.out.println("Age is " + (currentYear - dateOfBirth));

        String usersAgeWithPartialYear = "28.5";
        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
        System.out.println("The user says he is " + ageWithPartialYear);

        getInputFromConsole();


    }

    public static void getInputFromConsole(){
        // it is not going to work in IDE
        // it is built for terminal usage only
        try {
            String name = System.console().readLine("Hi, what is your name: ");
            System.out.println("Hi " + name + ". Thanks for taking Java course");

            String dateOfBirth = System.console().readLine("What year were you born?: ");
            System.out.println("You are currently " + (2023 - Integer.parseInt(dateOfBirth)) + " years old");
        } catch (NullPointerException e){
            getInputFromScanner();
        }

    }

    public static void getInputFromScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hi, what is your name: ");
        String name = scanner.nextLine();



        try {
            int currentYear = 2023;
            System.out.println(name + ", enter a year of birth between 1900 and " + currentYear);
            int dateOfBirth = scanner.nextInt();
            scanner.nextLine(); // to clean the buffer


            if (checkData(currentYear, dateOfBirth)){
                System.out.println("You are currently " + (2023 - dateOfBirth) + " years old");
            } else {
                System.out.println("Invalid date of birth");
            }
        } catch (NumberFormatException nfe){
            System.out.println("Problem while converting String to a numeric value");
        }  catch (InputMismatchException e){
            System.out.println("Characters now allowed");
        }



    }

    public static boolean checkData(int currentYear, int dateOfBirth){

        return (dateOfBirth > 1900 && dateOfBirth <= currentYear);

    }
}