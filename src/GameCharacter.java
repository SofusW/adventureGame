public interface GameCharacter {

    String name = "";
    int health = 0;
    int attackPower = 0;

    String getName();

    void setName(String name);

    int getHealth();

    void setHealth(int health);

    int getAttackPower();

    void setAttackPower(int attackPower);

    void attack(GameCharacter enemy);

}




