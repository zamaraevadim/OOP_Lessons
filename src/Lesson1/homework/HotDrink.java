package Lesson1.homework;

import Lesson1.Product;

public class HotDrink extends Product {


    public HotDrink(String name, double volume, int temperature) {
        super(name, volume,temperature);

    }


    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + super.getName() + '\'' +
                ", volume=" + super.getVolume() +
                ", temperature=" + super.getTemperature() +
                '}';
    }
}
