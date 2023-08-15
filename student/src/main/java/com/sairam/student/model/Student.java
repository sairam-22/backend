package com.sairam.student.model;

import lombok.Data;

@Data
public class Student {

    private int id;
    private String name;
    private int standard;
    private String section;
    private String gender;
    private int age;
    private long contactNo;
    private String guardianName;

}
