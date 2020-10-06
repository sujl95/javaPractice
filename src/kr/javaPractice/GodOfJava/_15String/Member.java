package kr.javaPractice.GodOfJava._15String;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.io.Serializable;

public class Member implements Serializable {
    private String name;
    private String email;
    private int age;

    public Member(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
    @Override
    public String toString() {
        return String.format("Member{name='%s', email='%s', age='%s'}", name, email, age);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}
