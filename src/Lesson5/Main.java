package Lesson5;

import Lesson5.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("qwer","qweqew","qwewerwr");
        controller.createStudent("qwer","qweqew","qwewerwr");
        controller.createStudent("qwer","qweqew","qwewerwr");

        controller.getAllStudent();
    }
}
