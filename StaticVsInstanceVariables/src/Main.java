public class Main {
    public static void main(String[] args) {
        // static variable's features are as follows
        // - declared by using static keyword
        // - also known as static member variables
        // - every instance of the class shares the same static variables
        // - therefore, if changes are made to that variable, all other instances
        // of that class will see the effect of that change
        // - an instance is not required to exist to access a static variable

        // instance variable's features are as follows
        // - do not use static keyword
        // - also known as field or member variable
        // - belongs to a specific instance of a class
        // - each instance has its own copy of an instance variable
        // - every instance can have a different value
        // - represents state of a specific instance of a class

        // static method's features are as follows
        // - cannot access instance methods and instant variables directly
        // - usually used for operations that do not require any data from an instance of a class
        // this keyword is the current object / instance of a class.
        // therefore, inside a static method, we cannot use this keyword
        //

        Dog dog1 = new Dog("rex");
        Dog dog2 = new Dog("fluffy");

        System.out.println(Dog.NO_OF_DOGS);
        System.out.println(dog1.getName());
        System.out.println(dog2.getName());

        System.out.println(Calculator.sum(3,5));
        Calculator.printSum(1,2);
        System.out.println(Calculator.sum(1.2, 3.5));
    }
}