public class Main {
    public static void main(String[] args) {

        System.out.println(sum3And5());
    }

    public static int sum3And5(){

        int sum = 0;

        for (int i = 1; i <=1000; i++){
            if (i % 3 == 0 && i % 5 == 0){
                // System.out.println(i);
                sum += i;
            }
        }

        return sum;
    }
}