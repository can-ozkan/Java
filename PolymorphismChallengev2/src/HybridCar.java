public class HybridCar extends Car{

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public void setAvgKmPerLitre(double avgKmPerLitre) {
        this.avgKmPerLitre = avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void startEngine() {
        System.out.printf("HybridCar -> All %d cylinders are fired up. Ready! \n", cylinders);
        System.out.printf("HybridCar -> switch %d kwh battery on. \n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("HybridCar -> usage below the average %.2f \n", avgKmPerLitre);
    }
}
