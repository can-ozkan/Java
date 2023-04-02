public class Main {
    public static void main(String[] args) {

        SmartKitchen smartKitchen = new SmartKitchen();

        smartKitchen.getDishWasher().doDishes();
        smartKitchen.getIceBox().orderFood();
        smartKitchen.getBrewMaster().brewCoffee();

        System.out.println(smartKitchen.getBrewMaster().isHasWorkToDo());

        smartKitchen.setKitchenState(true,true,true);
        smartKitchen.doKitchenWork();
    }
}