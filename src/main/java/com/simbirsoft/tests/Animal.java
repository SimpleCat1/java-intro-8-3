package com.simbirsoft.tests;

import java.util.ArrayList;

public abstract class Animal {
    protected int year;
    protected String textForSound;
    ArrayList<String> partsOfExistence = new ArrayList<>();

    protected Animal(String text, int year) {
        this.textForSound = text;
        this.year = year;
        partsOfExistence.add("Голова");
        partsOfExistence.add("Туловище");
    }

    protected Animal() {
        this.textForSound = "Мяу";
        this.year = 17;

        partsOfExistence.add("Голова");
        partsOfExistence.add("Туловище");
    }

    protected void setYear(int year) {
        this.year = year;
    }

    protected int getYear() {
        return this.year;
    }

    protected void makeASound() {
        System.out.println(textForSound);
    }
}
