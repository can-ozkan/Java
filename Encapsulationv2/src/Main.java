public class Main {
    public static void main(String[] args) {

        // In java, encapsulation means hiding things, by making them private or inaccessible
        // To make the interface simpler, we may want to hide unnecessary details
        // To protect the integrity of data on an object, we may hide or restrict the access to some
        // data and operations

        PlayerBad playerBad = new PlayerBad();
        playerBad.name = "Tim";
        playerBad.health = 100;
        playerBad.weapon = "Sword";

        System.out.println(playerBad.healthRemaining());

        playerBad.loseHealth(20);
        System.out.println("Remaining health is " + playerBad.healthRemaining());

        playerBad.health = 200; // we need to prevent that usage
        // Problem 1 : Allowing direct access to data on an object can potentially bypass checks
        // Problem 2 : Allowing direct access to fields means calling code would need to change when
        // you edit any of the fields.
        // Problem 3 : Omitting a constructor initializing data may mean the calling code is responsible
        // for setting up this data on the new object

        PlayerGood playerGood = new PlayerGood("Tim");
        PlayerGood playerGood1 = new PlayerGood("Can", 200, "Sword");

        System.out.println("Initial health is " + playerGood.healthRemaining());
        System.out.println(playerGood1.getName() + " has an initial health of " + playerGood1.healthRemaining());



    }
}