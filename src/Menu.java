import java.util.Scanner;

public class Menu {

    public static void menu(Scanner scanner, GameCharacter enemy, int health) {

        GameCharacter player = new PlayerCharacter();

        System.out.println("Choose what to do.");
        System.out.println("1. Attack");
        System.out.println("2. Use potion");
        System.out.println("3. Run");

        try {

            int input = scanner.nextInt();

            switch (input) {

                case 1:
                    player.attack(enemy);
                    break;
                case 2:
                    ((PlayerCharacter) player).potion(health);
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
