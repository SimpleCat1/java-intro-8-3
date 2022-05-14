package com.simbirsoft.tests;

import java.util.ArrayList;

public abstract class Animal {
    protected int year;
    protected String text;
    ArrayList<String> partsOfExistence = new ArrayList<>();

    protected Animal(String text, int year){
        this.text=text;
        this.year=year;
        partsOfExistence.add("Голова");
        partsOfExistence.add("Туловище");
    }
    protected Animal(){
        this.text="Мяу";
        this.year=17;

        partsOfExistence.add("Голова");
        partsOfExistence.add("Туловище");
    }

    protected void setYear(int year) {
        this.year = year;
    }

    protected int getYear() {
        return this.year;
    }

    protected void animalSay() {
        System.out.println(text);
    }
}
