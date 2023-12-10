package Lesson5.service;

import Lesson5.model.Student;
import Lesson5.model.StudyGroup;
import Lesson5.model.Teacher;

import java.util.List;

public class EducationalGroupService {
    public StudyGroup getStudyGroup(Teacher teacher, List<Student> students){
        return new StudyGroup(teacher,students);
    }
}
