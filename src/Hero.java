public class Hero extends Personage{

    public Hero(String name) {
        super(name);
        System.out.println(name + " is created. Power = " + super.getPower() + ", " + "Knack = " + super.getKnack() + ", " + "Gold = " + super.getGold());
    }
}
