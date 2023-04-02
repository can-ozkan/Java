public class Main {
    public static void main(String[] args) {

        // String class is mutable and each method call returns a new String object

        String string1 = "This is a sample String";
        String emptyString = "";

        System.out.println("The length of the string1 is as follows: " + string1.length());
        // length returns the no of characters in the String

        System.out.println("The character at index 5 is as follows: " + string1.charAt(5));
        // charAt returns the character at the index that is passed

        System.out.println(string1.indexOf("sample"));
        // indexOf returns an integer, representing the index in the sequence where the String or character passed

        System.out.println(emptyString.isEmpty());
        // isEmpty() returns true if length is zero

        System.out.println(emptyString.isBlank());
        // isBlank() returns true if length is zero OR the string only contains whitespace characters

        String helloWorldLower = "Hello World".toLowerCase();
        if ("hello world".equals(helloWorldLower) ){
            System.out.println("Values match exactly");
        }

        if (helloWorldLower.equalsIgnoreCase("Hello World")){
            System.out.println("Values match ignoring case");
        }

        String helloWorld = "Hello World";
        if (helloWorld.startsWith("Hello")){
            System.out.println(helloWorld + " starts with Hello");
        }

        if (helloWorld.endsWith("World")){
            System.out.println(helloWorld + " ends with World");
        }

        if (helloWorld.contains("World")){
            System.out.println(helloWorld + " contains the World");
        }

        String birthDate = "25/11/1982";
        System.out.println(birthDate.indexOf("1982"));
        System.out.println("Birth year is " + birthDate.substring(birthDate.indexOf("1982")));
        System.out.println("Birth month is " + birthDate.substring(birthDate.indexOf("11"),
                birthDate.indexOf("11") +2));

        String newDate = String.join("/", "25", "11", "1982");
        System.out.println(newDate);
        System.out.println(newDate.replace('/', '-'));
        System.out.println("ABC".repeat(3));
        System.out.println("ABC".repeat(3).indent(4));


    }
}