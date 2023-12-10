package Lesson5.controller;

import Lesson5.View.StudentView;
import Lesson5.model.*;
import Lesson5.service.DataService;
import Lesson5.service.EducationalGroupService;

import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private final EducationalGroupService educationalGroupService = new EducationalGroupService();
    //— Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) и преподавателя (его id) и формирования учебной группы, путём вызова метода из сервиса;
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> studentList) {

        StudyGroup studyGroup = educationalGroupService.getStudyGroup(teacher,studentList);
        return studyGroup;
    }
    public void createStudent(String firstName, String secondName, String lastName){
        service.create(firstName,secondName,lastName, Type.STUDENT);
    }
    public void getAllStudent(){
        for(User user : service.getAllStudent()){
            studentView.printOnConsole((Student)user);
        }
    }

}
