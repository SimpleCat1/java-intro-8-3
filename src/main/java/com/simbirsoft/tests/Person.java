package com.simbirsoft.tests;

public class Person extends Animal {
    private String text = "Я кормлю пушистого";

    public Person() {
        super("Завтра на работу", 21);
    }

    public Person(String text, int year) {
        super(text, year);
    }

    public void tellsWhatYouAreMadeOf() {
        /*public ставим у методов и переменных , который используются у наследников основного класса потому,
        что так принято, либо Private,public ,но не Protected.Protected может стоять в основном классе
        */
        partsOfExistence.add("Левая рука");
        partsOfExistence.add("Правая рука");
        partsOfExistence.add("Правая нога");
        partsOfExistence.add("Левая нога");
        System.out.println("Привет, я человек, я состю из:");
        for (String unitPartsOfExistence : partsOfExistence) {
            System.out.println(unitPartsOfExistence);
        }
        System.out.println(text);
    }

    @Override
    public void setYear(int year) {
        if (year > 150) {
            System.out.println("Столько люди не живут");
        } else if (year > 0 & year <= 150) {
            this.year = year;
        } else {
            System.out.println("Вы указали несуществующий возраст, возраст должен быть положительный или больше 0");
        }
        System.out.println("Мне " + year + " лет");
    }
}
