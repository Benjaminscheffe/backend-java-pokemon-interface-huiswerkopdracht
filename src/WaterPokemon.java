import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");
    static final String type = "water";

    public WaterPokemon(String name, int level, int hp, String sound, String food) {
        super(name, level, hp, sound, food, type);
    }

    List<String> getAttacks() {
        return attacks;
    }

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println( name.getName() + " attacks " + enemy.getName() + " with ");

        int hpDamage;

        String type = enemy.getType();
        switch(type) {
            case "fire":
                hpDamage = 20;
                break;
            case "electric":
                hpDamage = 15;
                break;
            case "grass":
                hpDamage = 10;
                break;
            case "water":
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

    void hydroPump(Pokemon name, Pokemon enemy){
        System.out.println( name.getName() + " attacks " + enemy.getName() + " with hydroPump");

        int hpDamage;

        String type = enemy.getType();
        switch(type) {
            case "fire":
                hpDamage = 20;
                break;
            case "electric":
                hpDamage = 15;
                break;
            case "grass":
                hpDamage = 10;
                break;
            case "water":
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

    void hydroCanon(Pokemon name, Pokemon enemy){
        System.out.println( name.getName() + " attacks " + enemy.getName() + " with hydroCanon");

        int hpDamage;

        String type = enemy.getType();
        switch(type) {
            case "fire":
                hpDamage = 20;
                break;
            case "electric":
                hpDamage = 15;
                break;
            case "grass":
                hpDamage = 10;
                break;
            case "water":
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

    void rainDance(Pokemon name, Pokemon enemy){
        System.out.println( name.getName() + " attacks " + enemy.getName() + " with rainDance");

        int hpDamage;
        boolean noDamage = false;
        boolean hpBoost = false;

        String type = enemy.getType();
        switch(type) {
            case "fire":
                hpDamage = 20;
                break;
            case "electric":
                hpDamage = 0;
                noDamage = true;
                break;
            case "grass":
                hpDamage = 0;
                hpBoost = true;
                break;
            case "water":
                hpDamage = 5;
                break;
            default:

                hpDamage = 30;
                System.out.println("Geen type opgegeven!");
        }

        if (noDamage) {
            System.out.println("has no effect on " + enemy.getName());
        } else if (hpBoost) {
            System.out.println("Hp boost for " + enemy.getName());

            int hpAfterAttack = enemy.getHp() + 30;

            enemy.setHp(hpAfterAttack);

            System.out.println(enemy.getName() + " increased hp with: 30");

            System.out.println(enemy.getName() + " has now: " + hpAfterAttack + " hp");

        } else {
            int hpAfterAttack = enemy.getHp() - hpDamage;

            enemy.setHp(hpAfterAttack);

            System.out.println(enemy.getName() + " loses " + hpDamage);

            System.out.println(enemy.getName() + " has left: " + hpAfterAttack + " hp");
        }



    }

}
