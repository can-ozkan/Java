public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }

        int j = 0;
        while (j < 5){
            System.out.println(j);
            j++;
        }

        j = 0;
        while (true){
            if (j > 4){
                break;
            }

            System.out.println(j);
            j++;
        }

        boolean isReady = false;
        j = 0;

        do {
            if (j > 4){
                break;
            }

            System.out.println(j);
            j++;
        }while (isReady);

        // continue statement, in its simplest form, will stop executing the current iteration of a block of code
        // and start a new iteration

        int number = 0;
        while (number < 50){
            number += 5;

            if (number % 25 == 0){
                continue;
            }

            System.out.print(number + "_");
        }
    }




}