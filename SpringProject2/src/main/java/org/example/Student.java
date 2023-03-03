package org.example;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;


    public Student(int id, String name, List<Phone> ph, Address add) {
        this.id = id;
        this.name = name;
        this.ph = ph;
        this.add = add;
    }

    public void studentsInfo() {
       System.out.println("The student's name is: " + name + " , their id is: " + id + " . Their address is: " + add + " . Their phone number is: " + ph + " .");
   }
}
