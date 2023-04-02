public class Main {
    public static void main(String[] args) {
        // super keyword is used to access or call the parent class members and methods
        // this is used to call the current class members
        // this is required when we have a parameter with the same name as an instance variable or field
        // We can use either of them in a class except for static elements like a static method

        SubClass s = new SubClass();
        s.printMethod();
        Rectangle rectangle = new Rectangle();

    }
}

class SuperClass { // parent class aka super class
    public void printMethod(){
        System.out.println("Printed in SuperClass");
    }
}

class SubClass extends SuperClass{
    @Override
    public void printMethod() {
        // super is commonly used with method overriding when we call a method with the same name,
        // from the parent class
        super.printMethod(); // calls the method in SuperClass, parent
        System.out.println("Printed in SubClass");
    }
}
