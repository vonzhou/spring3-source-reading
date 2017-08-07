package com.vonzhou.learn.domain.user;

/**
 * @version 2017/8/4.
 */
public class User {
    private int id;
    private String name;
    private int age;
    private String sex;

    public User() {
    }

    public User(int id, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" + "age=" + age + ", id=" + id + ", name='" + name + '\'' + ", sex='" + sex + '\'' + '}';
    }
}
