public class Dog {

    private String name;
    public static int NO_OF_DOGS;

    public Dog(String name) {
        this.name = name;
        NO_OF_DOGS++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNoOfDogs() {
        return NO_OF_DOGS;
    }

    public static void setNoOfDogs(int noOfDogs) {
        NO_OF_DOGS = noOfDogs;
    }
}
