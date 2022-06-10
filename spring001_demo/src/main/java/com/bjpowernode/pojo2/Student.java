package com.bjpowernode.pojo2;

public class Student {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Student() {
        System.out.println("学生的无参方法被执行。。。。");
    }

    //引用类型的成员变量，学校
    private School school;
}
