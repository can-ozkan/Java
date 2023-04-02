public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "the Mitsubishi is starting.";
    }

    @Override
    public String accelerate() {
        return "the Mitsubishi is accelerating.";
    }

    @Override
    public String brake() {
        return "the Mitsubishi is braking.";
    }
}
