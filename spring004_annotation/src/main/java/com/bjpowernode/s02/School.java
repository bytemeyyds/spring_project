package com.bjpowernode.s02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class School {
    @Value("清华大学")
    private String name;

    public School() {
        System.out.println("school的无参构造方法");
    }

    @Value("北京")
    private String address;

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
