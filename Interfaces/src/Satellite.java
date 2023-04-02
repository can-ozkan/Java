public class Satellite implements OrbitEarth{


    @Override
    public void fly() {

    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void achieveOrbit() {
        System.out.printf("Orbit achieved in " + getClass().getName());
    }
}
