import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue is " + myIntValue);
        System.out.println("anotherIntValue is " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue is " + myIntValue);
        System.out.println("anotherIntValue is " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray; // two references pointing to the same array

        System.out.println("myIntArray is " + Arrays.toString(myIntArray));
        System.out.println("anotherArray is " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("After change myIntArray is " + Arrays.toString(myIntArray));
        System.out.println("After change anotherArray is " + Arrays.toString(anotherArray));

        modifyArray(myIntArray);

        System.out.println("After another change / modify myIntArray is " + Arrays.toString(myIntArray));
        System.out.println("After another change / modify anotherArray is " + Arrays.toString(anotherArray));
    }

    public static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[]{1,2,3,4,5}; // de-referencing and pointing to another array
    }
}