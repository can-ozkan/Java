public class Main {
    public static void main(String[] args) {

        // You can crate an object by instantiating an object
        // Object and instance are interchangeable terms
        // You can create many objects using a single class. Each may have unique values or attributes

        House blueHouse = new House("blue");
        House anotherHouse = blueHouse; // two references to the same object

        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());

        anotherHouse.setColor("red");
        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());
        // the above two lines will print red
        // because we still have two references that point to the same object

        House greenHouse = new House("green"); // now we have two objects in memory and three references
        anotherHouse = greenHouse;
        // refereces are as follows: blueHouse, anotherHouse and greenHouse

        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());
        System.out.println(greenHouse.getColor());





    }
}