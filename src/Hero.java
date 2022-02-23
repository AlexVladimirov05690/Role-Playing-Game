public class Hero extends Personage {

    public Hero(String name) {
        super(name);
        System.out.println(name + " Силушкой в " + super.getPower() + ", " + "Проворством " + super.getKnack() + ", " + "Богатством " + super.getGold());
    }

    @Override
    public String toString() {
        return (super.getName() + " Здоровья осталось " + super.getHp() + ". Сила стала " + super.getPower() + ". Ловкость стала " + super.getKnack() + ". Золота стало " + super.getGold());
    }
}
