import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] myArray = {1,2,3,4,5};
        sortArrayInDesc(myArray);
        System.out.println(Arrays.toString(myArray));

        int[] array1 = randomlyGenerateArray(10);
        System.out.println(Arrays.toString(array1));
        sortArrayInDesc(array1);
        System.out.println(Arrays.toString(array1));

    }

    public static void sortArrayInDesc(int[] array){
        for (int i = 0; i < array.length-1; i++){
            for (int j = 0; j < array.length-1; j++){
                if (array[j] < array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static int[] randomlyGenerateArray(int length){
        Random random = new Random();
        int[] generatedArray = new int[length];

        for (int i = 0; i< generatedArray.length; i++){
            generatedArray[i] = random.nextInt(100);
        }

        return generatedArray;
    }
}