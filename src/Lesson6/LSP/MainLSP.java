package Lesson6.LSP;

public class MainLSP {
    public static void main(String[] args) {
        QuadRangle quadRangle = new Rectangle(5,5);
        quadRangle = new Square(5);
    }
}
