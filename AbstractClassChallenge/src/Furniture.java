public class Furniture extends ProductForSale {

    public Furniture(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.printf("This %s was manufactured in North Carolina\n", type);
        System.out.printf("The price of the piece is %6.2f \n", price);
        System.out.printf("%s\n", description);
    }
}
