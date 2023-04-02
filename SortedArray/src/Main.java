import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] myIntArray = getIntegers(5);
        printArray(sortIntegers(myIntArray));
    }

    public static int[] getIntegers(int number){
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[number];

        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        for (int i=0; i< array.length-1;i++){
            for (int j=0;j<array.length-1; j++){
                if (array[j]<array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }


}