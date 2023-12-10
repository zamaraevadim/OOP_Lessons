package Lesson6.LSP;

public class Square extends QuadRangle{
    int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public int area() {
        return length * length;
    }
}
