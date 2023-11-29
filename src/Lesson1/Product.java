package Lesson1;

public abstract class Product {
    private  String name;
    private  double cost;
    private double volume;
    private int temperature;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
    public Product(String name, double volume, int temperature) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", volume=" + volume +
                ", temperature=" + temperature +
                '}';
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}

