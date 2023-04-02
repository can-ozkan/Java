public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void eat(){
        System.out.println("Dog is eating");
    }

    public void move(){
        System.out.println("Dog is moving");
    }

    public void walk(){
        System.out.println("Dog is walking");
        super.move(6);
        move();
    }

    public void run(){
        System.out.println("Dog is running");
    }
}
