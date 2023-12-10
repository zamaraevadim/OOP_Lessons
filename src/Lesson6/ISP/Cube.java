package Lesson6.ISP;

public class Cube implements Shape,Shape3D{
    int length;

    public Cube(int length) {
        this.length = length;
    }

    @Override
    public double perimetr() {
        return 0;
    }

    @Override
    public double volume() {
        return length * length * length;
    }
}
