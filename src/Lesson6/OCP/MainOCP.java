package Lesson6.OCP;

public class MainOCP {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(100,"Велосипед");
        printVehicle(vehicle);
        vehicle = new Car(99);
        printVehicle(vehicle);
        vehicle = new Bus(40);
        printVehicle(vehicle);

    }
    public static void printVehicle(Vehicle vehicle){
        System.out.println(vehicle + String.valueOf(vehicle.calculateAllowedSpeed()));
    }
}
