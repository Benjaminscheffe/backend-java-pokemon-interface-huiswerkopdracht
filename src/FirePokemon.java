import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    List<String> attacks = Arrays.asList("fireLash", "flameThrower", "pyroBall", "inferno");
    static final String type = "fire";

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, sound, food, type);
    }

    List<String> getAttacks() {
        return attacks;
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println( name.getName() + " attacks " + enemy.getName() + " with fireLash");

        int hpDamage;

        String type = enemy.getType();
        switch(type) {
            case "grass":
                hpDamage = 20;
                break;
            case "water":
                hpDamage = 15;
                break;
            case "electric":
                hpDamage = 10;
                break;
            case "fire":
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

    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println( name.getName() + " attacks " + enemy.getName() + " with flameThrower");

        int hpDamage;

        String type = enemy.getType();
        switch(type) {
            case "grass":
                hpDamage = 20;
                break;
            case "water":
                hpDamage = 15;
                break;
            case "electric":
                hpDamage = 10;
                break;
            case "fire":
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

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println( name.getName() + " attacks " + enemy.getName() + " with pyroBall");

        int hpDamage;

        String type = enemy.getType();
        switch(type) {
            case "grass":
                hpDamage = 20;
                break;
            case "water":
                hpDamage = 15;
                break;
            case "electric":
                hpDamage = 10;
                break;
            case "fire":
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

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println( name.getName() + " attacks " + enemy.getName() + " with inferno");

        int hpDamage;

        String type = enemy.getType();
        switch(type) {
            case "grass":
                hpDamage = 20;
                break;
            case "water":
                hpDamage = 15;
                break;
            case "electric":
                hpDamage = 10;
                break;
            case "fire":
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
