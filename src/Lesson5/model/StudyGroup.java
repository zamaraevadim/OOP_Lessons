package Lesson5.model;

import java.util.List;

public class StudyGroup {
    Teacher teacher;
    List<Student> studentList;

    public StudyGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }


}
