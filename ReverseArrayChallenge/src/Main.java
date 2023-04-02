import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] initialArray = {1,2,3,4,5};

        System.out.println("Before reversing, the array is " + Arrays.toString(initialArray));
        int[] reversedArray = reverseArray(initialArray);
        System.out.println("After reversing, the array is " + Arrays.toString(reversedArray));


    }

    private static int[] reverseArray(int[] array){
        int[] returnedArray = new int[array.length];

        for (int i=0; i< array.length; i++){
            returnedArray[i] = array[array.length-1-i];
        }

        return returnedArray;
    }
}