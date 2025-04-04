import java.util.ArrayList;

public class PlayerCharacter implements GameCharacter{

    String name = "CharacterName";
    int health = 100;
    int attackPower = 15;
    ArrayList<Relic> inventory = new ArrayList<Relic>();

    public static void attack(GameCharacter enemy) {

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

        health = health+50;

        if(health > 100) {
            health = 100;
        }

        return health;
    }

    public void dodge() {

    }



}
