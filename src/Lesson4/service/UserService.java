package Lesson4.service;

import Lesson4.model.User;

public interface UserService <T extends User>{
    void create(String firstName,String secondName,String lastName);
}
