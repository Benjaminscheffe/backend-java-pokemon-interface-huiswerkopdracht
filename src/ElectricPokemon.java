import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");
    static final String type = "electric";

    public ElectricPokemon(String name, int level, int hp, String sound, String food) {
        super(name, level, hp, sound, food, type);
    }

    List<String> getAttacks() {
        return attacks;
    }

    void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println( name.getName() + " attacks " + enemy.getName() + " with thunderPunch");

        int hpDamage;

        String type = enemy.getType();
        switch(type) {
            case "water":
                hpDamage = 20;
                break;
            case "grass":
                hpDamage = 15;
                break;
            case "fire":
                hpDamage = 10;
                break;
            case "electric":
                hpDamage = 5;
                break;
            default:

                hpDamage = 30;
                System.out.println("Geen type opgegeven!");
        }

        int hpAfterAttack = enemy.getHp() - hpDamage;

        enemy.setHp(hpAfterAttack);

        System.out.println(enemy.getName() + " loses " + hpDamage);

        System.out.println(enemy.getName() + " has left: " + hpAfterAttack + " hp");
    }

    void electroBall(Pokemon name, Pokemon enemy){
        System.out.println( name.getName() + " attacks " + enemy.getName() + " with electroBall");

        int hpDamage;

        String type = enemy.getType();
        switch(type) {
            case "water":
                hpDamage = 20;
                break;
            case "grass":
                hpDamage = 15;
                break;
            case "fire":
                hpDamage = 10;
                break;
            case "electric":
                hpDamage = 5;
                break;
            default:

                hpDamage = 30;
                System.out.println("Geen type opgegeven!");
        }

        int hpAfterAttack = enemy.getHp() - hpDamage;

        enemy.setHp(hpAfterAttack);

        System.out.println(enemy.getName() + " loses " + hpDamage);

        System.out.println(enemy.getName() + " has left: " + hpAfterAttack + " hp");
    }

    void thunder(Pokemon name, Pokemon enemy){
        System.out.println( name.getName() + " attacks " + enemy.getName() + " with thunder");

        int hpDamage;
        boolean hpBoost = false;

        String type = enemy.getType();
        switch(type) {
            case "water":
                hpDamage = 20;
                break;
            case "grass":
                hpDamage = 15;
                break;
            case "fire":
                hpDamage = 10;
                break;
            case "electric":
                hpDamage = 0;
                hpBoost = true;
                break;
            default:

                hpDamage = 30;
                System.out.println("Geen type opgegeven!");
        }

        if (hpBoost) {
            System.out.println("Hp boost for " + enemy.getName());

            int hpAfterAttack = enemy.getHp() + 20;

            enemy.setHp(hpAfterAttack);

            System.out.println(enemy.getName() + " increased hp with: 20");

            System.out.println(enemy.getName() + " has now: " + hpAfterAttack + " hp");
        } else {
            int hpAfterAttack = enemy.getHp() - hpDamage;

            enemy.setHp(hpAfterAttack);

            System.out.println(enemy.getName() + " loses " + hpDamage);

            System.out.println(enemy.getName() + " has left: " + hpAfterAttack + " hp");
        }

    }

    void voltTackle(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with voltTackle");

        int hpDamage;

        String type = enemy.getType();
        switch(type) {
            case "water":
                hpDamage = 20;
                break;
            case "grass":
                hpDamage = 15;
                break;
            case "fire":
                hpDamage = 10;
                break;
            case "electric":
                hpDamage = 5;
                break;
            default:

                hpDamage = 30;
                System.out.println("Geen type opgegeven!");
        }

        int hpAfterAttack = enemy.getHp() - hpDamage;

        enemy.setHp(hpAfterAttack);

        System.out.println(enemy.getName() + " loses " + hpDamage);

        System.out.println(enemy.getName() + " has left: " + hpAfterAttack + " hp");
    }
}
