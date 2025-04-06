public class Enemy extends Monster {

    String name;
    int health;
    int attackPower;

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

    public Enemy(String name, int health, int attackPower) {

        this.name = name;
        this.health = health;
        this.attackPower = attackPower;

    }

    public void attack(GameCharacter enemy) {

        enemy.setHealth(enemy.getHealth()-attackPower);
        System.out.println(name + " dealt " + attackPower + " damage");

        if(enemy.getHealth() <= 0) {
            System.out.println("Game over");
            System.exit(0);
        }

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Name: " + name);
        sb.append(", Health: ");

        for(int i = 0; i < health; i ++) {

            sb.append("♥");

        }

        while(sb.length() <= 10) {
            sb.append(" ");
        }

        return sb.toString();
    }

}