import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");

        for (int i=0; i < groceryList.size(); i++){
            System.out.println(groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if (position >= 0){
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + position + " has been modified successfully.");
    }

    public void removeGroceryItem(String itemName){
        int position = findItem(itemName);
        if (position >= 0){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position){
        String deletedItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Grocery item " + position + " and  " + deletedItem + " has been deleted successfully.");
    }

    private int findItem(String searchItem){
        // boolean exists = groceryList.contains(searchItem);
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if (position >= 0){
            return true;
        }

        return false;
    }
}
