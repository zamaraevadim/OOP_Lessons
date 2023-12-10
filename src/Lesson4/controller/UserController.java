package Lesson4.controller;

import Lesson4.model.Student;
import Lesson4.model.User;
import Lesson4.service.StudentService;

public interface UserController <T extends User> {

    void create(String firstName,String secondName,String lastName);

}
