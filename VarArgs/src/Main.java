public class Main {
    public static void main(String[] args) {

        String[] splitStrings = "Hello World Again".split(" ");

        printText(splitStrings);
        printText("Hello World");
        printText("Hello");

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));
    }

    public static void printText(String... textList){
        for (String t : textList){
            System.out.println(t);
        }
        System.out.println("-".repeat(20));
    }
}