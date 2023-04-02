public class Main {
    public static void main(String[] args) {

        System.out.println("Sum of digits of 125 is " + digitSum(125));
        System.out.println("Sum of digits of -125 is " + digitSum(-125));
        System.out.println("Sum of digits of 4 is " + digitSum(4));
        System.out.println("Sum of digits of 3252 is " + digitSum(3252));

    }

    public static int digitSum(int number){
        int sum = 0;

        if (number < 10){return -1;}

        while (number > 0){
            // extract the least significant bit

            int digit = number % 10;
            sum += digit;

            // drop the least significant bit
            number /= 10;

        }

        return sum;
    }
}