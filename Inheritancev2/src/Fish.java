public class Fish extends Animal{

    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles(){
        System.out.println("Muscles are moving");
    }

    private void moveBackFin(){
        System.out.println("Back fin is moving");
    }

    @Override
    public void move(double speed) {
        super.move(speed);
        moveMuscles();
        if (speed >= 15){
            moveBackFin();
        }

        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
