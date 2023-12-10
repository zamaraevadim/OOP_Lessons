package Lesson3.homework;

import Lesson3.Student;
import Lesson3.StudentGroup;
import Lesson3.StudentGroupIterator;

import java.util.Iterator;
import java.util.List;

//— Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
//— Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
//— Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;
public class Stream implements Iterable<StudentGroup>{
    List<StudentGroup> studentGroupList;

    public Stream(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void addStudentGroup(StudentGroup studentGroup) {
        studentGroupList.add(studentGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }
    public void remove(StudentGroup studentGroup) {
        studentGroupList.remove(studentGroup);
    }

}
