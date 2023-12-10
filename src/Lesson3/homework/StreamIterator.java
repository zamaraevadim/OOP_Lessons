package Lesson3.homework;

import Lesson3.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    private final List<StudentGroup> groupList;
    private int counter;

    public StreamIterator(Stream stream) {
        this.groupList = stream.getStudentGroupList();
        this.counter = 0;
    }


    @Override
    public boolean hasNext() {
        return counter <= groupList.size() - 1;
    }

    @Override
    public StudentGroup next() {
        if(hasNext()){

            return groupList.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        groupList.remove(counter);
    }
}
