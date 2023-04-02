public record DragonFly(String name, String type) implements FlightEnabled{
    @Override
    public void fly() {
        System.out.println(getClass().getName() + " is flying");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getName() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getName() + " is landing");
    }
}
