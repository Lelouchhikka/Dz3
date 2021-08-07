package com.company;

import java.util.ArrayList;
import java.util.List;

public class UserBeanImp implements Userbean{
    List<User> users;

    public UserBeanImp(List<User> users) {
        this.users = users;
    }

    @Override
    public void getAllUsers() {
        for (User user : users) {
            System.out.println(user.getName()+" "+user.getSurname());
        }
    }

    @Override
    public void getUsersByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)){
                System.out.println(user.getName()+" "+user.getSurname());
            }
            else{
                System.out.println("Nothing");
            }
        }
    }

    @Override
    public void getUsersBySurname(String surname) {
        for (User user : users) {
            if (user.getName().equals(surname)){
                System.out.println(user.getName()+" "+user.getSurname());
            }
            else{
                System.out.println("Nothing");
            }
        }
    }
}
