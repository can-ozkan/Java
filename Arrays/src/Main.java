import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] intArray = new int[10];
        int[] intArray2 = {1,2,3,4,5,6,7,8,9,10};
        double[] doubleArray = new double[10];

        // initializing intArray[]
        for (int i=0; i < 10; i++){
            intArray[i] = i * 10;
        }

        // displaying the values of intArray
        for (int i=0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }

        // displaying the values of intArray2
        for (int i=0; i < intArray2.length; i++){
            System.out.println(intArray2[i]);
        }

        int[] myIntArray = getValues(5);

        // displaying the values of myIntArray
        for (int i=0; i < myIntArray.length; i++){
            System.out.println(myIntArray[i]);
        }

        System.out.println("The average is " + getAverage(myIntArray));

    }

    public static int[] getValues(int number){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter " + number + " values");
        int[] numbers = new int[number];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();

        }

        return numbers;
    }

    public static double getAverage(int[] numbers){
        int sum = 0;

        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }
}