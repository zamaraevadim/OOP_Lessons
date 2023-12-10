package Lesson3.homework;

import Lesson3.StudentGroup;

import java.util.Comparator;

public class StreamComparator implements Comparator<StudentGroup> {
    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        if (o1.getStudents().size() > (o2.getStudents().size())){
            return 1;
        }else if(o1.getStudents().size() < (o2.getStudents().size())){
            return -1;
        }
        return 0;

    }
}
