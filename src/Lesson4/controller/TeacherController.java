package Lesson4.controller;

import Lesson4.model.Teacher;
import Lesson4.service.TeacherService;
import Lesson4.view.TeacherView;

import java.util.List;

public class TeacherController implements UserController<Teacher> {
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        teacherService.create(firstName, secondName, lastName);
    }
    public void sendOnConsoleUserList(){
        teacherView.sendOnConsole(teacherService.getTeacherList());
    }
    public void edit(Teacher teacher,String firstName, String secondName, String lastName,int teacherId){
        teacherService.edit(teacher,firstName,secondName,lastName,teacherId);
    }
    public List<Teacher> getTeacherList(){
        return teacherService.getTeacherList();
    }
}
