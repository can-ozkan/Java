public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Generic animal", "huge", 5.0);
        Dog dog1 = new Dog("Husky", "middle", 5.5);
        Dog dog2 = new Dog("Wolf", "huge", 15);
        Fish fish1 = new Fish("Goldfish", 0.25, 2, 3);

        doAnimalStuff(animal1,4.5);
        doAnimalStuff(dog1, 10.5);
        doAnimalStuff(dog2, 17 );
        doAnimalStuff(fish1, 5);
    }

    public static void doAnimalStuff(Animal animal, double speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        //System.out.println(animal.hashCode());
        System.out.println("---------------");
    }
}