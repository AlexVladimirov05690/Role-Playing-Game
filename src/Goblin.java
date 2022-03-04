public class Goblin extends Personage{
    public Goblin() {
        super("Гоблин");
        System.out.println("Вам встречается Гоблин!" + " Силой " + getPower() + " и Ловокстью " + getKnack());
    }
}