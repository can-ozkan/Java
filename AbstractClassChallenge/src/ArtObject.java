public class ArtObject extends ProductForSale {

    public ArtObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.printf("This %s is a beautiful reproduction\n", type);
        System.out.printf("The price of the piece is %6.2f \n", price);
        System.out.printf("%s\n", description);
    }
}
