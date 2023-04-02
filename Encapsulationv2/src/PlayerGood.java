public class PlayerGood {

    private String name;
    private int health;
    private String weapon;

    public PlayerGood(String name) {
        this(name, 100, "No weapon provided");
    }

    public PlayerGood(String name, int health, String weapon) {
        this.name = name;
        if (health < 0){
            this.health = 1;
        } else if (health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        health -= damage;

        if (health <= 0){
            System.out.println("Player knocked out of the game");
        }
    }

    public int healthRemaining(){
        return health;
    }

    public void restoreHealth(int extraHealth){
        health += extraHealth;

        if (health >= 100){
            System.out.println(name + " restored to 100%");
        }
    }
}
