public interface FlightEnabled {

    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.5621371;

    void fly();
    void takeOff();
    void land();

    default FlightStages transition(FlightStages stage){
//        System.out.println("transition is not implemented on " + getClass().getName());
//        return null;

        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage+ " to " + nextStage);
        return nextStage;
    }


}
