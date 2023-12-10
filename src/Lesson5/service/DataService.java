package Lesson5.service;

import Lesson5.model.Student;
import Lesson5.model.Teacher;
import Lesson5.model.Type;
import Lesson5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList;

    public DataService() {
        this.userList = new ArrayList<>();
    }

    public void create(String firstName, String secondName, String lastName, Type type){
        int id = getMaxId(type);
        if(type == Type.STUDENT){
            userList.add(new Student(firstName,secondName,lastName,id));
        }
        if(type == Type.TEACHER){
            userList.add(new Teacher(firstName,secondName,lastName,id));
        }
    }
    private int getMaxId(Type type){
        boolean itsStudent = Type.STUDENT == type;
        int lastId = 1;
        for(User user : userList){
            if(user instanceof Teacher && !itsStudent){
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
            if(user instanceof Student && itsStudent){
                lastId = ((Student) user).getStudentId() + 1;
            }
        }
        return lastId;
    }
    public List<User> getAllStudent(){
        List<User> resultList = new ArrayList<>();
        for(User user : userList){
            if(user instanceof Student){
                resultList.add(user);
            }

        }
        return resultList;
    }
    public  List<User> getUserList(){
        return userList;
    }
}
