package Lesson1.homework;

import Lesson1.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrinksVendingMachine machine = new HotDrinksVendingMachine();
        List<Product> drinkList = new ArrayList<>();
        machine.initsProducts(drinkList);
        HotDrink hotDrink1 = new HotDrink("Tea",100,85);
        HotDrink hotDrink2 = new HotDrink("Coffee",200,80);
        HotDrink hotDrink3 = new HotDrink("Water",150,50);
        machine.hotDrinks.add(hotDrink1);
        machine.hotDrinks.add(hotDrink2);
        machine.hotDrinks.add(hotDrink3);
        System.out.println(machine.getProduct("Tea"));
        System.out.println(machine.getProduct("Water",150,50));

    }
}
