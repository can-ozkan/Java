public class MethodOverload{
      
      public static void main(String[] args) {
        int myNum1 = addNumbers(8, 5);
        double myNum2 = addNumbers(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
      }
      
      static int addNumbers(int x, int y) {
        return x + y;
      }
      
      static double addNumbers(double x, double y) {
        return x + y;
      }

}

