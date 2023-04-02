import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstruction();

        while (!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // to clean the input buffer

            switch (choice){
                case 0:
                    printInstruction();
                    break;

                case 1:
                    groceryList.printGroceryList();
                    break;

                case 2:
                    addItem();
                    break;
                    
                case 3:
                    modifyItem();
                    break;
                    
                case 4:
                    deleteItem();
                    break;
                    
                case 5:
                    searchForItem();
                    break;

                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Wrong choice.");
                    break;
            }
        }

    }

    private static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();

        if (groceryList.onFile(searchItem )){
            System.out.println(searchItem + " is found in our grocery list");
        }else {
            System.out.println(searchItem + " is not in our shopping list");
        }
    }

    private static void deleteItem() {
        System.out.print("Enter item name to be deleted: ");
        String itemNo = scanner.nextLine();

        groceryList.removeGroceryItem(itemNo);
    }

    private static void modifyItem() {
        System.out.print("Enter item to be modified: ");
        String itemNo = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
        
    }

    private static void addItem() {
        System.out.print("Please, enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    private static void printInstruction() {
        System.out.println("\nPress");
        System.out.println("\t0 - to print choice options");
        System.out.println("\t1 - to print the list of grocery items");
        System.out.println("\t2 - to add an item to the list");
        System.out.println("\t3 - to modify an item in the list");
        System.out.println("\t4 - to remove an item from the list");
        System.out.println("\t5 - to search for an item in the list");
        System.out.println("\t6 - to quit the application");
    }
}