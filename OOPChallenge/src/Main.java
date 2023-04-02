public class Main {
    public static void main(String[] args) {

/*      Item coke = new Item("drink", "coke", 1.5);
        Item avocado = new Item("Topping", "avocado", 1.50);

        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();
        avocado.printItem();*/

//        Burger burger = new Burger("regular", 4.0);
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();

        MealOrder regularMeal = new MealOrder();
        regularMeal.addBurgerToppings("HAM", "CHEESE", "MAYO");
        regularMeal.setDrinkSize("LARGE");
        regularMeal.printItemizedList();

        
    }
}