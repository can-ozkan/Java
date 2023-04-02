import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static GroceryList myGroceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int user_choice = 0;
        printInstructions();

        while (!quit){
            System.out.print("Enter your choice: ");
            user_choice = scanner.nextInt();
            scanner.nextLine();

            switch (user_choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    myGroceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }


    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t0 - to print choice options");
        System.out.println("\t1 - to print the list of grocery items");
        System.out.println("\t2 - to add an item to the list");
        System.out.println("\t3 - to modify an item in the list");
        System.out.println("\t4 - to remove an item from the list");
        System.out.println("\t5 - to search for an item in the list");
        System.out.println("\t6 - to quit the application");
    }

    public static void addItem(){
        System.out.print("Please, enter the grocery item: ");
        // myGroceryList.addGroceryItem(scanner);
        myGroceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Please, enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        myGroceryList.modifyGroceryItem(itemNo - 1, newItem);

    }

    public static void removeItem(){
        System.out.print("Please, enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        myGroceryList.removeGroceryItem(itemNo-1);
    }

    public static void searchForItem(){
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();

        if (myGroceryList.findItem(searchItem) != null){
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not our grocery list");
        }
    }

}