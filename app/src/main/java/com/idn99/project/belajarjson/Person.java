package com.idn99.project.belajarjson;


import java.util.ArrayList;

public class Person {
    private String namePerson;
    private int agePerson;
    private String genderPerson;
    private ArrayList<Alamat> alamats;

    public Person(String namePerson, int agePerson, String genderPerson, ArrayList<Alamat> alamats) {
        this.namePerson = namePerson;
        this.agePerson = agePerson;
        this.genderPerson = genderPerson;
        this.alamats = alamats;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public int getAgePerson() {
        return agePerson;
    }

    public String getGenderPerson() {
        return genderPerson;
    }

    public ArrayList<Alamat> getAlamats() {
        return alamats;
    }
}
