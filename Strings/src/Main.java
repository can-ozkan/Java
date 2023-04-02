public class Main {
    public static void main(String[] args) {

        String myString = "This is my String";
        System.out.println("My string is equal to " + myString);

        myString = myString + ", and this is more";
        System.out.println(myString);

        myString = myString + " \u00A9";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString); // 1050

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("lastString is equal to " + lastString); // 1050120.47

        


    }
}