import java.util.Random;

public abstract class Personage {
    private final String name;
    private int hp = 100;
    private int power;
    private int knack;
    private int gold;
    private int practice = 0;
    private int level = 0;
    boolean alive = true;
    Random random = new Random();

    public void setPower(int power) {
        this.power += power;
    }

    public void setKnack(int knack) {
        this.knack += knack;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level += level;
    }


    public int getPractice() {
        return practice;
    }



    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setGold(int gold) {
        this.gold += gold;
    }

    public void setPractice(int practice) {
        this.practice += practice;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public int getKnack() {
        return knack;
    }

    public int getGold() {
        return gold;
    }

    public Personage(String name) {
        this.name = name;
        power = random.nextInt(20) + 1;
        knack = random.nextInt(20) + 1;
        gold = random.nextInt(5);
    }

    public int attack(){
        int kick;
        if((random.nextInt(10) - (knack * 2)) < 0) {
            System.out.println(name + " наносит удар!!!");
            kick = power;
        }
        else if((random.nextInt(10) == knack)) {
            System.out.println(name + " наносит критический удар");
            kick = 2 * power;
        }
        else {
            System.out.println(name + " промахивается...");
            kick = 0;
        }
        return kick;
    }
    public void damage(int force) {
        hp = hp - force;
        if(hp <= 0) {
            alive = false;
            System.out.println(name + " погибает...");
        }
    }

    public void levelUp() {
        if(getLevel() < getPractice() / 100) {
            setLevel(1);
            setPower(10);
            setKnack(10);
            System.out.println("Уровень повышен! Способности возрасли!");
        }
    }

    @Override
    public String toString() {
        return (name + " " + hp + " hp");
    }
}
