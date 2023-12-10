package Lesson4;

import Lesson4.controller.StudentController;
import Lesson4.controller.TeacherController;
import Lesson4.model.Teacher;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        StudentController controller = new StudentController();
//        controller.create("1qwe","2qwe","3qwe");
//        controller.create("aqwe","4qwe","7qwe");
//        controller.create("bqwe","5qwe","8qwe");
//        controller.create("cqwe","6qwe","9qwe");
//        controller.sendOnConsoleUserList();
        TeacherController controller = new TeacherController();
        controller.create("1qwe","2qwe","3qwe");
        controller.create("aqwe","4qwe","7qwe");
        controller.create("bqwe","5qwe","8qwe");
        controller.create("cqwe","6qwe","9qwe");
        controller.sendOnConsoleUserList();
        System.out.println();
        List<Teacher> teacherList = controller.getTeacherList();
        controller.edit(teacherList.get(0),"Андрей","Иванов","Иванович",10 );
        controller.sendOnConsoleUserList();

    }
}
