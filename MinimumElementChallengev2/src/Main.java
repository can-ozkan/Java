import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] myArray = readIntegers();
        System.out.println(Arrays.toString(myArray));
        System.out.println("Min is " + findMimimum(myArray));
    }

    private static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, with comma separated: ");
        String userInput = scanner.nextLine();

        String[] sArray = userInput.split(",");
        int[] values = new int[sArray.length];

        for (int i=0; i< values.length; i++){
            values[i] = Integer.parseInt(sArray[i].trim());
        }

        return values;
    }

    private static int findMimimum(int[] array){
        int min = Integer.MAX_VALUE;
        for (int element : array){
            if (element < min){
                min = element;
            }
        }

        return min;
    }
}