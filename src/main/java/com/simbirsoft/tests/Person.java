package com.simbirsoft.tests;

public class Person extends Animal {
    private String text = "Я кормлю пушистого";

    protected Person() {
        super("Завтра на работу",21);
    }

    protected Person(String text, int year) {
        super(text, year);
    }
    protected void tellsWhatYouAreMadeOf() {
        partsOfExistence.add("Левая рука");
        partsOfExistence.add("Правая рука");
        partsOfExistence.add("Правая нога");
        partsOfExistence.add("Левая нога");
        System.out.println("Привет, я человек, я состю из:");
        for (String unitPartsOfExistence: partsOfExistence) {
            System.out.println(unitPartsOfExistence);
        }
        System.out.println(text);
    }
    protected void setYear(int year){
        if(year>150){
            System.out.println("Столько люди не живут");
        }else if(year>0 & year<=150){
            this.year=year;
        }else{
            System.out.println("Вы указали несуществующий возраст, возраст должен быть положительный или больше 0");
        }
        System.out.println("Мне "+year+" лет");
    }
}
