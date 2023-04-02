import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(findMin( readElements(readInteger())));
    }

    public static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        return input; // this represents how many elements the user needs to enter.
    }

    public static int[] readElements(int number){
        int[] intElements = new int[number];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < intElements.length; i++){
            intElements[i] = scanner.nextInt();
        }

        return intElements;
    }

    public static int findMin(int[] array){
        int min = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }

        return min;
    }
}