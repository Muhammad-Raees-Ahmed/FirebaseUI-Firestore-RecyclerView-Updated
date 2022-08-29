package com.example.firestoreui.Model;

public class User {
    private String name;
    private String fName;
    private String age;
    public User() {
        //empty constructor needed
    }

    public User(String name, String fName, String age) {
        this.name = name;
        this.fName = fName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getfName() {
        return fName;
    }

    public String getAge() {
        return age;
    }
}
