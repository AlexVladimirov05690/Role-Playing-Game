public class Dealer extends Personage implements Seller{
    public Dealer () {
        super("Торговец");
    }



    @Override
    public void sell(Hero hero) {
        final int cost = 5;
        System.out.println("Торговец: Зачем пожаловал, " + hero.getName() + "?");
        System.out.println(hero.getName() + ": Излечиться хочу!");
        System.out.println("Торговец: Зелье стоит " + cost + ". Есть у тебя столько денег?");
        if(hero.getGold() >= cost) {
            System.out.println(hero.getName() + ": Конечно есть! Давай сюда своё пойло");
            hero.setGold(-cost);
            hero.setHp(100);
            System.out.println(hero);
        } else {
            System.out.println(hero.getName() + ": Кажется не совсем.... Никуда не уходи, я скоро!");
        }
    }
}
