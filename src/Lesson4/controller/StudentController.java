package Lesson4.controller;

import Lesson4.model.Student;
import Lesson4.service.StudentService;
import Lesson4.view.StudentView;


public class StudentController implements UserController<Student> {
    private final StudentService studentService = new StudentService();
    private final StudentView studentView = new StudentView();
    @Override
    public void create(String firstName, String secondName, String lastName) {
        studentService.create(firstName, secondName, lastName);
    }
    public void sendOnConsoleUserList(){
        studentView.sendOnConsole(studentService.getStudentList());
    }
}
