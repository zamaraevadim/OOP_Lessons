package Lesson3.homework;

import Lesson3.Student;
import Lesson3.StudentGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    private Stream stream;

    public StreamService(Stream stream) {
        this.stream = stream;
    }

    public Stream getStream() {
        return stream;
    }
    public void removeStudent(StudentGroup studentGroup){
        for(StudentGroup studentGroup1 : stream){
            if(studentGroup.equals(studentGroup1)){
                stream.remove(studentGroup);
            }
        }
    }
    public List<StudentGroup> getSortedStream(){
        List<StudentGroup> studentGroupList = new ArrayList<>(stream.getStudentGroupList());
        studentGroupList.sort(new StreamComparator());
        return studentGroupList;
    }
}
