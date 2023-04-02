public class Main {
    public static void main(String[] args) {

        // A local variable is called local because it is available for use by the code block
        // in which it was declared

        // Scope describes the accessibility of a variable
        // in scope means the variable can be used by an executing block or any nested blocks
        // out of scope means the variable in question is no longer available

        // Local variables are always out-of-scope for outer blocks or the containing blocks they are declared in
        // Local variables are a way to store and manipulate temporary data

        { // starts on outer block - for ex, a method block
            int firstVariable = 5;
            int secondVariable = 10;

            if (firstVariable > 0){ // flow statement block starts inner block
                // inner block code has access outer block's variable

                System.out.println(secondVariable);
            }

        }
    }

    public static void aMethod(boolean aBoolean){
        if (aBoolean){
            int myCounter = 10; // myCounter is local to this if block
        }

        // System.out.println(myCounter); myCounter is out of scope here, compiler error
    }
}