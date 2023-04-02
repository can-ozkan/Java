import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] array2 = new int[4][4];

        for (int i=0; i< array2.length; i++){
            for (int j=0; j< array2.length; j++){
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        for (var outer : array2){
            for (var element : outer){
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(array2));
    }
}