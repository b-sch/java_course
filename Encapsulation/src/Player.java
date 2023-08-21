public class Player {

    public String fullName;
    public int health;
    public String weapon;

//    public Player(String name, int health, String weapon) {
//        this.name = name;
//        this.health = health;
//        this.weapon = weapon;
//    }

    public void loseHealth(int damage) {
        health -= damage;

        if (health <= 0) {
            System.out.println("Player knocked out of game.");
        }
    }

    public int healthRemaining() {
        return health;
    }

    private void restoreHealth(int extraHealth) {
        health += extraHealth;

        if (health > 100) {
            System.out.println("Player restored to 100%");
            health = 100;
        }
    }
}
