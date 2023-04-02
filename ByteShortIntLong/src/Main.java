public class Main {
    public static void main(String[] args) {

        // Integer work
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer minimum value " + myMinIntValue);
        System.out.println("Integer maximum value " + myMaxIntValue);
        System.out.println("Busted maximum value " + (myMaxIntValue + 1)); //This is called overflow
        System.out.println("Busted minimum value " + (myMinIntValue - 1)); //This is called underflow
        System.out.println("");

        // Byte work
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte minimum value " + myMinByteValue);
        System.out.println("Byte maximum value " + myMaxByteValue);
        System.out.println("");

        // Short work
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short minimum value " + myMinShortValue);
        System.out.println("Short maximum value " + myMaxShortValue);
        System.out.println("");

        // Long work

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("long minimum value " + myMinLongValue);
        System.out.println("long maximum value " + myMaxLongValue);
        System.out.println(myLongValue);
        System.out.println("");


    }
}