public class Car {

    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean isConvertible;

    public Car(String make, String model, String color, int doors, boolean isConvertible) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.doors = doors;
        this.isConvertible = isConvertible;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make == null){
            this.make = "unknown";
        } else {
            this.make = make;
        }

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    public String describeCar(){
        return this.model + " has " + this.doors + " doors with " + this.color + " color";
    }

}
