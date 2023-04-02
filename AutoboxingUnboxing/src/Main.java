import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
public class Main {
    public static void main(String[] args) {

        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Tim");

        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(54));
        ArrayList<Integer> intArrayList = new ArrayList<>();
        for (int i=0; i<10; i++){
            intArrayList.add(Integer.valueOf(i)); //autoboxing
        }

        for (int i=0; i<10; i++){
            System.out.println(i + " -> " + intArrayList.get(i).intValue()); //unboxing
        }

        Integer myInt = Integer.valueOf(54);

        ArrayList<Double> doubleArrayList = new ArrayList<>();

        for (double dbl=0.0; dbl<10.0; dbl+=0.5){
            doubleArrayList.add(Double.valueOf(dbl)); //autoboxing
        }

        for (int i=0; i<doubleArrayList.size(); i++){
            System.out.println(i + " -> " + doubleArrayList.get(i).doubleValue()); //unboxing
        }

    }
}