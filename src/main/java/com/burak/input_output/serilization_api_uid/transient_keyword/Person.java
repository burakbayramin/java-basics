package com.burak.input_output.serilization_api_uid.transient_keyword;

import java.io.Serializable;

public class Person implements Serializable {
    private String fname;
    private transient String lname;
    private transient int age;

    private static int personNum = 0;

    public static int getPersonNum() {
        return personNum;
    }

    public static void setPersonNum(int personNum) {
        Person.personNum = personNum;
    }

    public Person(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "First name: " + fname + "\nLast name: " + lname + "\nAge: " + age;
    }
}
