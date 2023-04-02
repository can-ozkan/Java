public class ElectricCar extends Car{

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public void setAvgKmPerCharge(double avgKmPerCharge) {
        this.avgKmPerCharge = avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public void startEngine() {
        System.out.printf("ElectricCar -> switch %d kwh battery on. \n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("ElectricCar -> usage under the average %.2f \n", avgKmPerCharge);
    }
}
