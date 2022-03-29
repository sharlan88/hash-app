package com.test;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello world");
        Person p1 = new Person();
        p1.setId(100);
        p1.setName("John");
        Person p2 = new Person();
        p2.setId(100);
        p2.setName("John");

        System.out.println(p1.equals(p2));

        Person p3 = p2;
        System.out.println(p2.equals(p3));

        System.out.println("Extra");
    }
}

class Person {
    private int id;
    private String name;

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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        if(this.id != person.id)
            return false;

        return  Objects.equals(name, person.name);
    }


}

