public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car -> startEngine");
    }

    public void drive(){
        System.out.println("Car -> driving and type is " + this.getClass().getName());
        runEngine();
    }

    protected void runEngine(){
        System.out.println("Car -> runEngine");
    }
}
