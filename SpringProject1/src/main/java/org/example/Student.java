package org.example;

import java.util.List;

public class Student {
private int id;
private String name;
private List<Phone> ph;
private Address ad;



    public void setId(int id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }


    public void setAd(Address ad) {
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + ph +
                ", ad=" + ad +
                '}';
    }
}
