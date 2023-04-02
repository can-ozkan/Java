public class Main {
    public static void main(String[] args) {

        int value = 3;

        if (value ==1) {
            System.out.println("Value is 1");
        } else if(value == 2){
            System.out.println("Value is 2");
        } else {
            System.out.println("Is not 1 or 2");
        }

        // this is a traditional switch statement

        switch (value) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("It is 3 or 4 or 5");
                System.out.println("it is indeed " + value);
                break;
            default:
                System.out.println("Is not 1, 2, 3, 4, or 5");
                break;
        }

        // this is an enhanced switch statement
        switch (value){
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            case 3, 4, 5 -> {
                System.out.println("It is 3 or 4 or 5");
                System.out.println("it is indeed " + value);
            }
            default -> System.out.println("Is not 1, 2, 3, 4, or 5");
        }

        String month = "april";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");

        month = "october";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");

        month = "abc";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month) {
        switch (month) {
            case "january":
            case "february":
            case "march":
                return "1st";

            case "april":
            case "may":
            case "june":
                return "2nd";

            case "july":
            case "august":
            case "september":
                return "3rd";

            case "october":
            case "november":
            case "december":
                return "4th";

            default:
                return "invalid month";

        }
    }
}