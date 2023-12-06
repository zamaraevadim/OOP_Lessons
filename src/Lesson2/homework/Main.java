package Lesson2.homework;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Вадим");
        Human human2 = new Human("Кристина");
        Human human3 = new Human("Катя");
        Human human4 = new Human("Егор");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.acceptToMarket(human4);
        market.update();

    }
}
