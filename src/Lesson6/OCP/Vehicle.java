package Lesson6.OCP;
//O — Open-Closed (Принцип открытости-закрытости)
//Классы должны  быть  открыты для расширения, но закрыты для модификации.

public class Vehicle {
    int maxSpeed;
    String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public double calculateAllowedSpeed(){
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "maxSpeed=" + maxSpeed +
                ", type='" + type + '\'' +
                '}';
    }
}
