import java.util.ArrayList;
import java.util.List;

public class PlayerCharacter implements GameCharacter{

    String name;
    int health;
    int attackPower;
    List<Relic> inventory;

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

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public List<Relic> getInventory() {
        return inventory;
    }

    public void setInventory(List<Relic> inventory) {
        this.inventory = inventory;
    }

    PlayerCharacter(String name, int health, int attackPower, List<Relic> inventory) {

        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.inventory = inventory;

    }

    public void attack(GameCharacter enemy) {
        enemy.setHealth(enemy.getHealth()-attackPower);
        System.out.println(name + " dealt " + attackPower + " damage");

        if(enemy.getHealth() <= 0) {
            System.out.println(enemy.getName() + " defeated");
            System.exit(0);
        }

    }

    public void collectRelic(ArrayList<Relic> inventory, Relic relic) {

        inventory.add(relic);
        System.out.println(relic + " was added to inventory");

    }

    public static void run() {
        System.out.println("You ran away successfully");
        //Menu.metode();

    }

    public static int potion(int health) {

        health = health+5;

        if(health > 10) {
            health = 10;
        }

        return health;
    }

    public void dodge() {

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Name: " + name);
        sb.append(" Health: ");

        for(int i = 0; i < health; i ++) {

            sb.append("♥");

        }

        while(sb.length() <= 10) {
            sb.append(" ");
        }

        return sb.toString();
    }

}
