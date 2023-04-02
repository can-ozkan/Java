public class Main {

    public static final String INVALID_VALUE = "Invalid Value";

    public static void main(String[] args) {

        System.out.println(getDurationString(61,10));
        System.out.println(getDurationString(122,50));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3946));
        System.out.println(getDurationString(-3945));
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes >= 0 && seconds >= 0 && seconds <= 60){
            int howManyHours = minutes / 60;
            int remainderMinutes = minutes % 60;
            int howManyMinutes = seconds / 60;
            int remainderSeconds = seconds % 60;

            return howManyHours + "h " + (remainderMinutes + howManyMinutes) + "m " + remainderSeconds + "s";
        }

        return INVALID_VALUE;
    }

    public static String getDurationString(int seconds){
        if (seconds >= 0){
            int howManyMinutes = seconds / 60;
            int remainderSeconds = seconds % 60;

            return getDurationString(howManyMinutes,remainderSeconds);
        }

        return INVALID_VALUE;
    }
}