public class Jet implements FlightEnabled, Trackable{


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

    @Override
    public void track() {
        System.out.println(getClass().getName() + " 's coordinates recorded");
    }

    @Override
    public FlightStages transition(FlightStages stage) {
        return FlightEnabled.super.transition(stage);
    }
}
