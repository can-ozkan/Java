public class Main {
    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float min value " + myMinFloatValue);
        System.out.println("Float max value " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double min value " + myMinDoubleValue);
        System.out.println("Double max value " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5f;
        float myFloatValue2 = (float) 5;
        double myDoubleValue = 5d;
        double myDoubleValue2 = 5d;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myFloatValue2);
        System.out.println(myDoubleValue);
        System.out.println(myDoubleValue2);

        myIntValue /= 3;
        myFloatValue /= 3f;
        myDoubleValue /= 3d;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        double pounds = 200;
        double kilogram = pounds * 0.45359237;



        System.out.println(kilogram);





    }
}