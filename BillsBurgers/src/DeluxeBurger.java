public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe Burger", "meat", 19.10, "bread");
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
    }

    @Override
    public double itemizeHamburger() {
        return 19.10;
    }
}
