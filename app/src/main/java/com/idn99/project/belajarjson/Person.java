package com.idn99.project.belajarjson;


import java.util.ArrayList;

public class Person {
    private String namePerson;
    private int agePerson;
    private String genderPerson;
    private ArrayList<Alamat> alamats;

    public Person(String namePerson, int agePerson, String genderPerson) {
        this.namePerson = namePerson;
        this.agePerson = agePerson;
        this.genderPerson = genderPerson;
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
}
