public interface GameCharacter {

    String name = "";
    int health = 0;
    int attackPower = 0;

    void attack(GameCharacter enemy);

}


