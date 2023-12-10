package Lesson3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(3,"qwe","qwe","qwe");
        Student student2 = new Student(4,"aqwe","qwe","qwer");
        Student student3 = new Student(2,"qwe","qwe","qwert");
        Student student4 = new Student(1,"qwe","qwe","qwerby");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        StudentGroup studentGroup = new StudentGroup(students);
        StudentGroupIterator groupIterator = new StudentGroupIterator(studentGroup);
        StudentGroupService service = new StudentGroupService(studentGroup);
        for(Student student : studentGroup){
            System.out.println(student);
        }
        System.out.println();

        for(Student student : service.getSortedStudentGroup()){
            System.out.println(student);
        }
        System.out.println();

        for(Student student : service.getSortedStudentGroupFIO()){
            System.out.println(student);
        }

    }
}
