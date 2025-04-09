import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{
    List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");
    static final String type = "grass";

    public GrassPokemon(String name, int level, int hp, String sound, String food) {
        super(name, level, hp, sound, food, type);
    }

    List<String> getAttacks() {
        return attacks;
    }

    public void leafStorm(Pokemon name, Pokemon enemy){
        System.out.println( name.getName() + " attacks " + enemy.getName() + " with leafStorm");

        int hpDamage;

        String type = enemy.getType();
        switch(type) {
            case "electric":
                hpDamage = 20;
                break;
            case "fire":
                hpDamage = 15;
                break;
            case "water":
                hpDamage = 10;
                break;
            case "grass":
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

    public void solarBeam(Pokemon name, Pokemon enemy){
        System.out.println( name.getName() + " attacks " + enemy.getName() + " with solarBeam");

        int hpDamage;

        String type = enemy.getType();
        switch(type) {
            case "electric":
                hpDamage = 20;
                break;
            case "fire":
                hpDamage = 15;
                break;
            case "water":
                hpDamage = 10;
                break;
            case "grass":
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

    public void leechSeed(Pokemon name, Pokemon enemy){
        System.out.println( name.getName() + " attacks " + enemy.getName() + " with leechSeed");

        int hpDamage;

        String type = enemy.getType();
        switch(type) {
            case "electric":
                hpDamage = 20;
                break;
            case "fire":
                hpDamage = 15;
                break;
            case "water":
                hpDamage = 10;
                break;
            case "grass":
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



        int hpBoostAfterAttack = name.getHp() + hpDamage;

        enemy.setHp(hpBoostAfterAttack);

        System.out.println(name.getName() + " wins " + hpDamage);

        System.out.println(name.getName() + " has now: " + hpBoostAfterAttack + " hp");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy){
        System.out.println( name.getName() + " attacks " + enemy.getName() + " with leaveBlade");

        int hpDamage;

        String type = enemy.getType();
        switch(type) {
            case "electric":
                hpDamage = 20;
                break;
            case "fire":
                hpDamage = 15;
                break;
            case "water":
                hpDamage = 10;
                break;
            case "grass":
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
