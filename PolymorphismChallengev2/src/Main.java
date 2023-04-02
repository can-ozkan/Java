public class Main {
    public static void main(String[] args) {

        Car car = new Car("2022 Blue Ferrari GTS 296 ");
        runRance(car);

        Car car1 = new GasPoweredCar("2022 Blue Ferrari GTS 296 ", 15.4, 6);
        runRance(car1);

        Car car2 = new ElectricCar("2022 Red Tesla Model 3", 568, 75);
        runRance(car2);

        Car car3 = new HybridCar("2022 Black Ferrari SF90 Stradale", 16,8,8);
        runRance(car3);

    }

    public static void runRance(Car car){
        car.startEngine();
        car.drive();
        System.out.println();
    }
}