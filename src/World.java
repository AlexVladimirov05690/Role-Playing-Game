import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class World {
    ArrayList<String> location = new ArrayList<>(3);
    String location1 = "1. К торговцу";
    String location2 = "2. В тёмный лес";
    String location3 = "3. На выход";
    String nameOfHero;
    Scanner scanner = new Scanner(System.in);

    public World() {
        startWorld();
    }

    private void startWorld() {
        location.add(location1);
        location.add(location2);
        location.add(location3);
        System.out.println("Welcome to Magic Java World!");
        System.out.println("Назовите вашего героя:");
        nameOfHero = scanner.nextLine();
        Hero hero = new Hero(nameOfHero);
        locationSelection(hero);

    }

    public void locationSelection(Hero hero) {
        setLocation();
        boolean result = true;
        while (result) {
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Merch");
                    break;
                case "2":
                    System.out.println("Forest");
                    Battle battle = new Battle(hero, randomMonster());
                    battle.start();
                    try {
                        battle.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(hero.alive) {
                        setLocation();
                    } else result = false;
                    break;
                case "3":
                    System.out.println("Досвидания");
                    result = false;
                    break;
                default:
                    System.out.println("Введите числа от 1 до 3");
            }

        }
    }

    private void setLocation() {
        System.out.println("Куда хотите направится?");
        for (int i = 0; i <= location.size() - 1; i++) {
            System.out.println(location.get(i));
        }
    }

    private Personage randomMonster() {
        Random random = new Random();
        if(random.nextInt(100) % 2 == 0) {
            return new Skeleton();
        } else return new Goblin();
    }
}
