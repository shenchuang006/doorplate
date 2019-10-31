package com.herbert.doorplate.entity;

import java.io.Serializable;

/**
 * @Auther: shenchuang
 * @Date: 2019/10/29 16:55
 * @Description:
 */
public class User implements Serializable{
    private static final long serialVersionUID = 3593249942843973931L;
    private int age;
    private String name;

    public User() {
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s,%d",this.name,this.age);
    }
}
