import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //The size of an array, once created, is fixed.
        // You cannot change the size of an array, after the array is instantiated

        int[] myIntArray = new int[10];
        myIntArray[0] = (int) 45.0;
        myIntArray[1] = Integer.parseInt("1");
        myIntArray[5] = 50;

        for (int i = 0; i < myIntArray.length; i++){
            System.out.println(myIntArray[i]);
        }

        double[] myDoubleArray = new double[10];
        for (int i = 0; i < myDoubleArray.length; i++){
            System.out.println(myDoubleArray[i]);
        }

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        int[] newArray = new int[5];

        for (int i = 0; i < newArray.length; i++){
            newArray[i] = newArray.length - i;
        }

        for (int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i]);
        }

        System.out.println();

        // for each loop - enhanced for loop
        for (int element : newArray){
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.println(Arrays.toString(newArray));

        Object objectVariable = newArray;
        if (objectVariable instanceof int[]){
            System.out.println("objectVariable is an int array");
        }

        // We use arrays to manage many items of same type


    }
}