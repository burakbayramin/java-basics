package com.burak.input_output.serilization_api_uid.serilization;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = (long) 1.0;
    private String name;
    private int id;
    private String department;

    public Student(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student name: " + name + "\nStudent id: " + id + "\nDepartment: " + department;
    }
}
