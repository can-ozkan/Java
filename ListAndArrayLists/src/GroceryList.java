import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ".item is " +groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
    }

    public void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    public String findItem(String searchItem){
        int position = groceryList.indexOf(searchItem);

        if (position >= 0){
            return groceryList.get(position);
        }
        return null;
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}
