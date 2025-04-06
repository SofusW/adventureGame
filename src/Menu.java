import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        GameCharacter player = new PlayerCharacter("Sofus", 10, 2, null);
        GameCharacter enemy = new Enemy("Bat", 3, 1);


        while(true) {
            battleMenu(player, enemy, scanner);
        }

    }

    public static void battleMenu(GameCharacter player, GameCharacter enemy, Scanner scanner) {

        System.out.println(player);
        System.out.println(enemy);

        System.out.println("Choose what to do.");
        System.out.println("1. Attack");
        System.out.println("2. Use potion");
        System.out.println("3. Run");

        try {

            int input = scanner.nextInt();

            switch (input) {

                case 1:

                    player.attack(enemy);
                    enemy.attack(player);

                    break;
                case 2:
                    ((PlayerCharacter) player).potion(((PlayerCharacter) player).getHealth());
                    break;
                case 3:
                    ((PlayerCharacter) player).run();
                    break;
                default:
                    System.err.println("This is not an option");

            }
        }catch(Exception e) {
            System.err.println("This is not an option");
            scanner.nextLine();

        }

    }


}
