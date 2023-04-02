import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        int switchValue = 4;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was 3 or 4 or 5");
                System.out.println("Actually, it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char newCharValue = 'G';

        switch (newCharValue){
            case 'A':
                System.out.println("A will be printed");
                break;

            case 'B':
                System.out.println("B will be printed");
                break;

            case 'C':
                System.out.println("C will be printed");
                break;

            case 'D':
                System.out.println("D will be printed");
                break;

            case 'E':
                System.out.println("E will be printed");
                break;

            default:
                System.out.println("Any of above");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;

            case "february":
                System.out.println("Feb");
                break;

            default:
                System.out.println("Not a valid month");
                break;
        }
    }
}