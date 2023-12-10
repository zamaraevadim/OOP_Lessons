package Lesson4.service;

import Lesson4.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {
    private final List<Student> studentList;

    public StudentService( ) {
        this.studentList = new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxId = 0;

        for(Student i : studentList) {
            if (maxId < i.getStudentId()) {
                maxId = i.getStudentId();
            }
        }
            maxId++;

            studentList.add(new Student(firstName,secondName,lastName,maxId));

    }
}
