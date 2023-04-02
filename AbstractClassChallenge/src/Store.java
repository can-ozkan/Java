import java.util.ArrayList;

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();


    public static void main(String[] args) {

        storeProducts.add(new ArtObject("Oil Painting", 1350,
                "Impressionistic work by ABF painted in 2010"));
        storeProducts.add(new ArtObject("Sculpture", 2000,
                "Bronze work by JKF, produced in 1950"));
        storeProducts.add(new Furniture("Desk", 500, "Mahogany Desk"));
        storeProducts.add(new Furniture("Lamp", 200, "Tiffany Lamp with Hummingbirds"));


        listProducts();

        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);

        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 3, 5);
        addItemToOrder(order2, 2, 1);
        printOrder(order2);
    }

    public static void addItemToOrder(ArrayList<OrderItem> orders, int orderIndex, int quantity){
        orders.add(new OrderItem(quantity, storeProducts.get(orderIndex)));
    }

    public static void listProducts(){
        for (ProductForSale item : storeProducts){
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void printOrder(ArrayList<OrderItem> orders){
        double salesTotal = 0;

        for (var item : orders){
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }

        System.out.printf("Sales Total = $%6.2f \n", salesTotal);
    }
}
