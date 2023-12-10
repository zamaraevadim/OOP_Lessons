package Lesson6.LSP;

public class Rectangle extends QuadRangle{
     int width;
     int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int area() {
        return 2;
    }
}
