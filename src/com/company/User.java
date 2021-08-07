package com.company;

public class User {


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    String name;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    String surname;

}
