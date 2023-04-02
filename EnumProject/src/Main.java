import java.util.Random;

public class Main {
    public static void main(String[] args) {

        DayOfTheWeek weekDay = DayOfTheWeek.SUN;

        System.out.println(weekDay);

        for (int i=0; i<10; i++){
            weekDay = getRandomDay();
            // System.out.printf("Name is %s and Ordinal value is %d\n", weekDay.name(), weekDay.ordinal());
            switchDayOfTheWeek(weekDay);
        }

        for (Topping topping: Topping.values()) {
            System.out.println(topping.name() + " is " + topping.getPrice());
        }

    }

    public static DayOfTheWeek getRandomDay(){
        Random random = new Random();
        int randomValue = random.nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomValue];
    }

    public static void switchDayOfTheWeek(DayOfTheWeek weekDay){
        int weekDayInteger = weekDay.ordinal() + 1;

        switch (weekDay){
            case SUN -> System.out.println("Sunday and " + weekDayInteger);
            case MON -> System.out.println("Monday and " + weekDayInteger);
            case TUE -> System.out.println("Tuesday and " + weekDayInteger);
            case WED -> System.out.println("Wednesday and " + weekDayInteger);
            case THU -> System.out.println("Thursday and " + weekDayInteger);
            case FRI -> System.out.println("Friday and " + weekDayInteger);
            case SAT -> System.out.println("Saturday and " + weekDayInteger);
        }
    }
}