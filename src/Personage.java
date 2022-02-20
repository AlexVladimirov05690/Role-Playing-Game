import java.util.Random;

public abstract class Personage {
    private String name;
    private int hp = 100;
    private int power;

    public int getPower() {
        return power;
    }

    public int getKnack() {
        return knack;
    }

    public int getGold() {
        return gold;
    }

    private int knack;
    private int gold;
    private int practice = 0;
    boolean alive = true;
    Random random = new Random();

    public Personage(String name) {
        this.name = name;
        power = random.nextInt(9) + 1;
        knack = random.nextInt(9) + 1;
        gold = random.nextInt(5);
    }

    public int attack(){
        int kick;
        if((random.nextInt(10) - (knack * 2)) < 0) {
            System.out.println(name + " strikes!!!");
            kick = power;
        }
        else if((random.nextInt(10) == knack)) {
            System.out.println(name + " deals a critical kick");
            kick = 2 * power;
        }
        else {
            System.out.println("Miss!!!");
            kick = 0;
        }
        return kick;
    }
    public void damage(int force) {
        hp = hp - force;
        if(hp <= 0) {
            alive = false;
            System.out.println(name + " is dead...");
        }
    }
}
