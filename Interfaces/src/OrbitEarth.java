public interface OrbitEarth extends FlightEnabled{

    void achieveOrbit();

    static void log(String description){
        var today = new java.util.Date();
        System.out.println(today + " : " + description);
    }

    private void logStage(FlightStages state, String description){
        description = state + " : " + description;
        log(description);

    }

    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(stage, "Beginning transition to " + nextStage);
        return nextStage;
    }
}
