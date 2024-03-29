public class Main {
    public static void main(String[] args) {

        printDayOfTheWeek(1);
        printDayOfTheWeek(6);
        printDayOfTheWeek(8);
        printDayOfTheWeek(-1);
        printDayOfTheWeekIf(1);
        printDayOfTheWeekIf(6);
        printDayOfTheWeekIf(8);
        printDayOfTheWeekIf(-1);

    }

    public static void printDayOfTheWeek(int day){
        switch (day){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wedneday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void printDayOfTheWeekIf(int day){
        if (day == 1){
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wedneday");
        } else if (day == 4){
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day");
        }
    }
}