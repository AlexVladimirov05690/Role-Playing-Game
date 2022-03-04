public class Battle extends Thread {
    Hero hero;
    Personage monster;

    public Battle(Hero hero, Personage monster) {
        this.hero = hero;
        this.monster = monster;
    }


    public void battle() {
        while (hero.alive && monster.alive) {
            monster.damage(hero.attack());
            hero.damage(monster.attack());
            System.out.println(hero.getName() + " " + hero.getHp() + " hp");
            System.out.println(monster.toString());
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (hero.alive) {
            System.out.println(hero.getName() + " Победил!!! И получает 100 опыта и " + monster.getGold() + " золота");
            hero.setPractice(100);
            hero.setGold(monster.getGold());
            hero.setPractice(100);
            hero.levelUp();
            System.out.println(hero.toString());
        } else {
            System.out.println("Игра окончена....");
        }
    }

    @Override
    public void run() {
        battle();
    }
}
