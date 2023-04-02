public class Car extends Vehicle{

    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        // Car is a Vehicle
        // There is an is-a relationship between car and vehicle

        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }


}
