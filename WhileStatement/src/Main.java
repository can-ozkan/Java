public class Main {
    public static void main(String[] args) {


        int count = 1;
        while (count < 6){
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("------------------------");

        count = 1;
        while (count != 6) {

            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("------------------------");

        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count < 6);

        System.out.println("------------------------");

        int number = 4;
        int finishNumber = 20;
        int counter = 0;

        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }

            counter++;
            System.out.println("Even number " + number);

            if (counter == 5){
                break;
            }

        }
    }

    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}