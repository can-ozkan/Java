import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<String> groceryList = new ArrayList<>();

    public static void main(String[] args) {


        int user_input = -1;


        do {
            printMenu();
            user_input = scanner.nextInt();
            scanner.nextLine();

            switch (user_input){
                case 0:
                    break;
                case 1:
                    addItem();
                    break;
                case 2:
                    deleteItem();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }while (user_input != 0);
        printMenu();

    }

    public static void printMenu(){
        System.out.print("""
                Available actions:
                                
                0 - to shutdown
                                
                1 - to add item(s) to list (comma delimited list)
                                
                2 - to remove any items (comma delimited list)
                                
                Enter a number for which action you want to do: 
                """);
    }

    public static void addItem(){
        String userInput = scanner.nextLine();
        String[] groceryArray = userInput.split(",");
        System.out.println("to be added " + Arrays.toString(groceryArray));
        System.out.println("Checking if they are already in the grocery list");

        for (String element : groceryArray){
            if (!groceryList.contains(element.trim())){
                groceryList.add(element.trim());
            }
        }

        groceryList.sort(Comparator.naturalOrder());
        System.out.println("Current list is " + groceryList);

    }

    public static void deleteItem(){
        String userInput = scanner.nextLine();
        String[] groceryArray = userInput.split(",");
        System.out.println("to be deleted " + Arrays.toString(groceryArray));
        System.out.println("Checking if they are already in the grocery list");

        for (String element : groceryArray){
            if (groceryList.contains(element.trim())){
                groceryList.remove(element.trim());
            }
        }

        groceryList.sort(Comparator.naturalOrder());
        System.out.println("Current list is " + groceryList);
    }
}