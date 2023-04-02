public class Main {
    public static void main(String[] args) {

        // Java provides a mutable class that lets us change its text value
        // String methods create a new object in memory and return a reference to this newly created object
        // StringBuilder methods return a StringBuilder reference but it is really a self-reference

        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");

        // StringBuilder helloWorldBuilder = "Hello" + " World"; you cannot do that
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

    }

    public static void printInformation(String string){
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void printInformation(StringBuilder builder){
        System.out.println("StringBuilder = " + builder);
        System.out.println("Length = " + builder.length());
        System.out.println("Capacity =  " + builder.capacity());
    }
}