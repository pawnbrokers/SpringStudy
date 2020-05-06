package com.kuang.pojo;

import lombok.Data;


public class User {
    public User(){
        System.out.println("这里是User的无参构造方法");
    }

    public User(String name) {
        System.out.println("这里是User的有参构造方法");
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
