package Lesson6.DIP;

public class MainDIP {
    public static void main(String[] args) {
        Car car = new Car(new DieseEngine());
        car.start();
        car = new Car(new PetrolEngine());
        car.start();
    }
}
