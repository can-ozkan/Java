public class Main {
    public static void main(String[] args) {

        int myMinIntValue = Integer.MIN_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        short myMinShortValue = Short.MIN_VALUE;

        int myTotal = myMinIntValue / 2;
        byte newByteValue = (byte) (myMinByteValue / 2); // required byte, provided int
        short newShortValue = (short) (myMinShortValue / 2); // required short, provided int

        System.out.println(newByteValue);
        System.out.println(newShortValue);





    }
}