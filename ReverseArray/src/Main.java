import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    reverse(new int[] {2,3,4,5,6});
    }

    private static void reverse(int[] array){
        int[] reversed_array = new int[array.length];

        for (int i = 0; i < array.length; i++){
            reversed_array[i] = array[array.length - i -1];
        }

        System.out.println("Array = " + Arrays.toString(array) );
        System.out.println("Reversed array = " + Arrays.toString(reversed_array));
    }
}