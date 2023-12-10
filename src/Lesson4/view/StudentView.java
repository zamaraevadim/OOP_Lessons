package Lesson4.view;

import Lesson4.model.Student;

import java.util.List;

public class StudentView implements UserView<Student> {
    @Override
    public void sendOnConsole(List<Student> list) {
        for(Student i : list){
            System.out.println(i + " ");
        }
    }
}
