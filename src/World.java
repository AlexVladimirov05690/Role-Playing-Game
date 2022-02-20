import java.util.ArrayList;
import java.util.Scanner;

public class World {
    ArrayList<String> location = new ArrayList<>(3);
    String location1 = "1. To the merchant";
    String location2 = "2. Into the dark forest";
    String location3 = "3. Out";
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
        System.out.println("Name your Hero:");
        nameOfHero = scanner.nextLine();
    }

    public void locationSelection() {
        System.out.println("Where are you heading?");
        for (int i = 0; i <= location.size() - 1; i++) {
            System.out.println(location.get(i));
        }
        boolean result = true;
        while (result) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Merch");
                    result = false;
                    break;
                case 2:
                    System.out.println("Forest");
                    result = false;
                    break;
                case 3:
                    System.out.println("Exit");
                    result = false;
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }

}
