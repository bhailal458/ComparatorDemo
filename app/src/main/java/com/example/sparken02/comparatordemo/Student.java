package com.example.sparken02.comparatordemo;

import android.support.annotation.NonNull;

/**
 * Created by sparken02 on 13/6/17.
 */

public class Student  {

    int rollno;
    String name;
    int age;

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public int compareTo(@NonNull Student o) {
//        if(age == o.age)
//            return 0;
//
//        else if(age > o.age)
//            return 1;
//
//        else
//            return -1;
//
//    }
}
