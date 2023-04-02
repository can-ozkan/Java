public class Main {
    public static void main(String[] args) {
        // method overloading means providing two or more separate methods in a class
        // with the same name but different parameters

        // Method return type may or may not be different and that allows us to reuse the same
        // method name. It reduces duplicated code and we do not have to remember multiple method names

        // We can overload static or instance methods
        // Usually overloading happens in a single class

        // Method overriding means defining a method in a child class that already exists in the parent class
        // with the same signature (same method name, same method arguments)
        // We cannot override static methods, only instance methods can be overridden
        // Only inherited methods can be overridden
        // Constructors and private methods cannot be overridden
        // Methods that are final cannot be overridden

        System.out.println(sum(3, 5));
        System.out.println(sum(1.0, 2.5));

        Dog dog1 = new Dog();
        dog1.bark();

        GermanShepherd gs1 = new GermanShepherd();
        gs1.bark();


    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static double sum(double a, double b){
        return a + b;
    }
}

class Dog{
    public void bark(){
        System.out.println("woof!");
    }
}

class GermanShepherd extends Dog{
    @Override
    public void bark() {
        // super.bark();
        System.out.println("woof woof woof!");
    }
}