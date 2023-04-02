public abstract class Mammal extends Animal {

    // An abstract class that extends another abstract class has some flexibility
    // It can implement all the parent's abstract methods
    // It can implement some
    // Or it can implement none of them
    // It can also include additional abstract methods, which will force subclasses to implement both
    // Animal's abstract methods and Mammal's abstract methods


    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println(getExplicitType() + " ");
        System.out.println(speed.equalsIgnoreCase("slow") ? "walks" : "runs");
    }

    public abstract void shedHair();
}
