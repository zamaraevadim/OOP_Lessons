package Lesson6.OCP;

public class Car extends Vehicle {

    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    @Override
    public double calculateAllowedSpeed() {
        return maxSpeed * 0.8;
    }
}
