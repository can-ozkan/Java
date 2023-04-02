public class Main {
    public static void main(String[] args) {

        byte myByteValue = 10;
        short myShortValue = 170;
        int myIntValue = 200;
        long myLongValue = 50000L + (10L * (myByteValue + myShortValue + myIntValue));

        System.out.println(myLongValue);

    }
}