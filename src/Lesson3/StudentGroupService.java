package Lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    private StudentGroup students;

    public StudentGroupService(StudentGroup students) {
        this.students = students;
    }

    public StudentGroup getStudents() {
        return students;
    }
    public void removeStudent(Student student){
        for(Student student1 : students){
            if(student.equals(student1)){
                students.remove(student);
            }
        }
    }
    public List<Student> getSortedStudentGroup(){
        List<Student> students1 = new ArrayList<>(students.getStudents());
        Collections.sort(students1);
        return students1;
    }
    public List<Student> getSortedStudentGroupFIO(){
        List<Student> students1 = new ArrayList<>(students.getStudents());
        students1.sort(new StudentGroupComparator());
        return students1;
    }
}
