public class Main {
    public static void main(String[] args) {

        char charValue = 'X';
        switch (charValue) {
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is baker");
                break;
            case 'C':
                System.out.println("C is charlie");
                break;
            case 'D':
                System.out.println("D is dog");
                break;
            case 'E':
                System.out.println("E is easy");
                break;
            default:
                System.out.println("Letter " + charValue + " was not found in the switch");
                break;
        }

        // with an enhanced switch case

        switch (charValue){
            case 'A' -> System.out.println("A is able");
            case 'B' -> System.out.println("B is baker");
            case 'C' -> System.out.println("C is charlie");
            case 'D' -> System.out.println("D is dog");
            case 'E' -> System.out.println("E is easy");
            default -> System.out.println("Letter " + charValue + " was not found in the switch");
        }

        System.out.println(printDayOfWeek(0));
        System.out.println(printDayOfWeek(1));
        System.out.println(printDayOfWeek(2));
        System.out.println(printDayOfWeek(3));
        System.out.println(printDayOfWeek(4));
        System.out.println(printDayOfWeek(5));
        System.out.println(printDayOfWeek(6));
        System.out.println(printDayOfWeek(7));

        System.out.println(printWeekDay(0));
        System.out.println(printWeekDay(1));
        System.out.println(printWeekDay(2));
        System.out.println(printWeekDay(3));
        System.out.println(printWeekDay(4));
        System.out.println(printWeekDay(5));
        System.out.println(printWeekDay(6));
        System.out.println(printWeekDay(7));
    }

    public static String printDayOfWeek(int day) {
        return switch (day){
            case 0 -> "sunday";
            case 1 -> "monday";
            case 2 -> "tuesday";
            case 3 -> "wednesday";
            case 4 -> "thursday";
            case 5 -> "friday";
            case 6 -> "saturday";
            default -> "invalid day";
        };
    }

    public static String printWeekDay(int day){
        if (day == 0){
            return "sunday";
        } else if (day == 1){
            return "monday";
        } else if (day == 2) {
            return "tuesday";
        } else if (day == 3) {
            return "wednesday";
        } else if (day == 4) {
            return "thursday";
        } else if (day == 5) {
            return "friday";
        } else if (day == 6) {
            return "saturday";
        } else {
            return "invalid day";
        }
    }
}