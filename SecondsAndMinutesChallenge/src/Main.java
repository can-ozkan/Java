public class Main {
    public static void main(String[] args) {

        // 1 min = 60 seconds
        // 1 hour = 60 min = 3600 seconds

        System.out.println(getDurationString(3700));
        System.out.println(getDurationString(70));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(-3700));
        System.out.println(getDurationString(-65, 45));


    }

    public static String getDurationString(int seconds) {

        if (seconds >= 0) {
            int hours = seconds / 3600;
            int remainingSeconds = seconds % 3600;
            int minutes = remainingSeconds / 60;
            remainingSeconds = remainingSeconds % 60;

            //return "hours: " + hours + " minutes: " + minutes + " seconds " + remainingSeconds;
            return hours + "h " + minutes + "m " + remainingSeconds + "s";
        }

        return "Invalid input";

    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes >= 0 && seconds >= 0) {
            return getDurationString(minutes * 60 + seconds);
        }

        return "Invalid input";
    }


}